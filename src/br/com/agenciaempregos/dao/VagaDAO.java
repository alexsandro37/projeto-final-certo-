package br.com.agenciaempregos.dao;

import br.com.agenciaempregos.database.ConexaoSQLite;
import br.com.agenciaempregos.model.Vaga;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class VagaDAO {

    private static final String SELECT = "SELECT v.*, e.nome AS empresa_nome FROM vagas v "
            + "JOIN empresas e ON e.id = v.empresa_id ";

    public void inserir(Vaga vaga) throws SQLException {
        String sql = "INSERT INTO vagas (empresa_id, titulo, descricao, area, cidade, salario) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, vaga.getEmpresaId());
            ps.setString(2, vaga.getTitulo());
            ps.setString(3, vaga.getDescricao());
            ps.setString(4, vaga.getArea());
            ps.setString(5, vaga.getCidade());
            definirSalario(ps, 6, vaga.getSalario());
            ps.executeUpdate();
            try (ResultSet chaves = ps.getGeneratedKeys()) {
                if (chaves.next()) {
                    vaga.setId(chaves.getInt(1));
                }
            }
        }
    }

    public Vaga buscarPorId(int id) throws SQLException {
        List<Vaga> lista = consultar(SELECT + "WHERE v.id = ?", id);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public List<Vaga> listar() throws SQLException {
        return consultar(SELECT + "ORDER BY v.titulo");
    }

    public List<Vaga> listarPorEmpresa(int empresaId) throws SQLException {
        return consultar(SELECT + "WHERE v.empresa_id = ? ORDER BY v.titulo", empresaId);
    }

    public List<Vaga> buscarPorArea(String area) throws SQLException {
        return consultar(SELECT + "WHERE v.area = ? COLLATE NOCASE ORDER BY v.titulo", area);
    }

    public boolean atualizar(Vaga vaga) throws SQLException {
        String sql = "UPDATE vagas SET titulo = ?, descricao = ?, area = ?, cidade = ?, salario = ? WHERE id = ?";
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, vaga.getTitulo());
            ps.setString(2, vaga.getDescricao());
            ps.setString(3, vaga.getArea());
            ps.setString(4, vaga.getCidade());
            definirSalario(ps, 5, vaga.getSalario());
            ps.setInt(6, vaga.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("DELETE FROM vagas WHERE id = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private void definirSalario(PreparedStatement ps, int posicao, Double salario) throws SQLException {
        if (salario == null) {
            ps.setNull(posicao, Types.REAL);
        } else {
            ps.setDouble(posicao, salario);
        }
    }

    private List<Vaga> consultar(String sql, Object... parametros) throws SQLException {
        List<Vaga> lista = new ArrayList<>();
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            for (int i = 0; i < parametros.length; i++) {
                ps.setObject(i + 1, parametros[i]);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapear(rs));
                }
            }
        }
        return lista;
    }

    private Vaga mapear(ResultSet rs) throws SQLException {
        Vaga v = new Vaga();
        v.setId(rs.getInt("id"));
        v.setEmpresaId(rs.getInt("empresa_id"));
        v.setTitulo(rs.getString("titulo"));
        v.setDescricao(rs.getString("descricao"));
        v.setArea(rs.getString("area"));
        v.setCidade(rs.getString("cidade"));
        double salario = rs.getDouble("salario");
        v.setSalario(rs.wasNull() ? null : salario);
        v.setEmpresaNome(rs.getString("empresa_nome"));
        return v;
    }
}
