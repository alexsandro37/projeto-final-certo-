package br.com.agenciaempregos.dao;

import br.com.agenciaempregos.database.ConexaoSQLite;
import br.com.agenciaempregos.model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidatoDAO {

    public void inserir(Candidato candidato) throws SQLException {
        String sql = "INSERT INTO candidatos (usuario_id, telefone, area_interesse, resumo) VALUES (?, ?, ?, ?)";
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, candidato.getUsuarioId());
            ps.setString(2, candidato.getTelefone());
            ps.setString(3, candidato.getAreaInteresse());
            ps.setString(4, candidato.getResumo());
            ps.executeUpdate();
            try (ResultSet chaves = ps.getGeneratedKeys()) {
                if (chaves.next()) {
                    candidato.setId(chaves.getInt(1));
                }
            }
        }
    }

    public Candidato buscarPorId(int id) throws SQLException {
        return buscarUm("SELECT * FROM candidatos WHERE id = ?", id);
    }

    public Candidato buscarPorUsuario(int usuarioId) throws SQLException {
        return buscarUm("SELECT * FROM candidatos WHERE usuario_id = ?", usuarioId);
    }

    public List<Candidato> listar() throws SQLException {
        List<Candidato> lista = new ArrayList<>();
        try (Connection c = ConexaoSQLite.conectar();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM candidatos ORDER BY id")) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public boolean atualizar(Candidato candidato) throws SQLException {
        String sql = "UPDATE candidatos SET telefone = ?, area_interesse = ?, resumo = ? WHERE id = ?";
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, candidato.getTelefone());
            ps.setString(2, candidato.getAreaInteresse());
            ps.setString(3, candidato.getResumo());
            ps.setInt(4, candidato.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("DELETE FROM candidatos WHERE id = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private Candidato buscarUm(String sql, int parametro) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, parametro);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? mapear(rs) : null;
            }
        }
    }

    private Candidato mapear(ResultSet rs) throws SQLException {
        Candidato c = new Candidato();
        c.setId(rs.getInt("id"));
        c.setUsuarioId(rs.getInt("usuario_id"));
        c.setTelefone(rs.getString("telefone"));
        c.setAreaInteresse(rs.getString("area_interesse"));
        c.setResumo(rs.getString("resumo"));
        return c;
    }
}
