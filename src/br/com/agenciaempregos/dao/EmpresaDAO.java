package br.com.agenciaempregos.dao;

import br.com.agenciaempregos.database.ConexaoSQLite;
import br.com.agenciaempregos.model.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO {

    public void inserir(Empresa empresa) throws SQLException {
        String sql = "INSERT INTO empresas (usuario_id, nome, cnpj, area_atuacao, telefone, sobre) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, empresa.getUsuarioId());
            ps.setString(2, empresa.getNome());
            ps.setString(3, empresa.getCnpj());
            ps.setString(4, empresa.getAreaAtuacao());
            ps.setString(5, empresa.getTelefone());
            ps.setString(6, empresa.getSobre());
            ps.executeUpdate();
            try (ResultSet chaves = ps.getGeneratedKeys()) {
                if (chaves.next()) {
                    empresa.setId(chaves.getInt(1));
                }
            }
        }
    }

    public Empresa buscarPorId(int id) throws SQLException {
        return buscarUm("SELECT * FROM empresas WHERE id = ?", id);
    }

    public Empresa buscarPorUsuario(int usuarioId) throws SQLException {
        return buscarUm("SELECT * FROM empresas WHERE usuario_id = ?", usuarioId);
    }

    public List<Empresa> listar() throws SQLException {
        List<Empresa> lista = new ArrayList<>();
        try (Connection c = ConexaoSQLite.conectar();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM empresas ORDER BY nome")) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public boolean atualizar(Empresa empresa) throws SQLException {
        String sql = "UPDATE empresas SET nome = ?, cnpj = ?, area_atuacao = ?, telefone = ?, sobre = ? WHERE id = ?";
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, empresa.getNome());
            ps.setString(2, empresa.getCnpj());
            ps.setString(3, empresa.getAreaAtuacao());
            ps.setString(4, empresa.getTelefone());
            ps.setString(5, empresa.getSobre());
            ps.setInt(6, empresa.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("DELETE FROM empresas WHERE id = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private Empresa buscarUm(String sql, int parametro) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, parametro);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? mapear(rs) : null;
            }
        }
    }

    private Empresa mapear(ResultSet rs) throws SQLException {
        Empresa e = new Empresa();
        e.setId(rs.getInt("id"));
        e.setUsuarioId(rs.getInt("usuario_id"));
        e.setNome(rs.getString("nome"));
        e.setCnpj(rs.getString("cnpj"));
        e.setAreaAtuacao(rs.getString("area_atuacao"));
        e.setTelefone(rs.getString("telefone"));
        e.setSobre(rs.getString("sobre"));
        return e;
    }
}
