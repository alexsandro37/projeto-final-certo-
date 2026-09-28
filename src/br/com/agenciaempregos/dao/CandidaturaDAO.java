package br.com.agenciaempregos.dao;

import br.com.agenciaempregos.database.ConexaoSQLite;
import br.com.agenciaempregos.model.Candidatura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CandidaturaDAO {

    private static final String SELECT = "SELECT ca.*, u.nome AS candidato_nome, v.titulo AS vaga_titulo, "
            + "e.nome AS empresa_nome FROM candidaturas ca "
            + "JOIN candidatos cd ON cd.id = ca.candidato_id "
            + "JOIN usuarios u ON u.id = cd.usuario_id "
            + "JOIN vagas v ON v.id = ca.vaga_id "
            + "JOIN empresas e ON e.id = v.empresa_id ";

    public void inserir(Candidatura candidatura) throws SQLException {
        String sql = "INSERT INTO candidaturas (candidato_id, vaga_id) VALUES (?, ?)";
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, candidatura.getCandidatoId());
            ps.setInt(2, candidatura.getVagaId());
            ps.executeUpdate();
            try (ResultSet chaves = ps.getGeneratedKeys()) {
                if (chaves.next()) {
                    candidatura.setId(chaves.getInt(1));
                }
            }
        }
    }

    public Candidatura buscarPorId(int id) throws SQLException {
        List<Candidatura> lista = consultar(SELECT + "WHERE ca.id = ?", id);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public List<Candidatura> listarPorCandidato(int candidatoId) throws SQLException {
        return consultar(SELECT + "WHERE ca.candidato_id = ? ORDER BY ca.id DESC", candidatoId);
    }

    public List<Candidatura> listarPorVaga(int vagaId) throws SQLException {
        return consultar(SELECT + "WHERE ca.vaga_id = ? ORDER BY ca.id DESC", vagaId);
    }

    public List<Candidatura> listarPorEmpresa(int empresaId) throws SQLException {
        return consultar(SELECT + "WHERE v.empresa_id = ? ORDER BY ca.id DESC", empresaId);
    }

    public boolean atualizarStatus(int id, String status) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("UPDATE candidaturas SET status = ? WHERE id = ?")) {
            ps.setString(1, status);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("DELETE FROM candidaturas WHERE id = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private List<Candidatura> consultar(String sql, int parametro) throws SQLException {
        List<Candidatura> lista = new ArrayList<>();
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, parametro);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapear(rs));
                }
            }
        }
        return lista;
    }

    private Candidatura mapear(ResultSet rs) throws SQLException {
        Candidatura c = new Candidatura();
        c.setId(rs.getInt("id"));
        c.setCandidatoId(rs.getInt("candidato_id"));
        c.setVagaId(rs.getInt("vaga_id"));
        c.setDataCandidatura(rs.getString("data_candidatura"));
        c.setStatus(rs.getString("status"));
        c.setCandidatoNome(rs.getString("candidato_nome"));
        c.setVagaTitulo(rs.getString("vaga_titulo"));
        c.setEmpresaNome(rs.getString("empresa_nome"));
        return c;
    }
}
