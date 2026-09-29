package br.com.agenciaempregos.dao;

import br.com.agenciaempregos.database.ConexaoSQLite;
import br.com.agenciaempregos.model.ProcessoSeletivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivoDAO {

    private static final String SELECT = "SELECT p.*, u.nome AS candidato_nome, v.titulo AS vaga_titulo, e.nome AS empresa_nome "
            + "FROM processos_seletivos p "
            + "JOIN candidaturas ca ON ca.id = p.candidatura_id "
            + "JOIN candidatos cd ON cd.id = ca.candidato_id "
            + "JOIN usuarios u ON u.id = cd.usuario_id "
            + "JOIN vagas v ON v.id = ca.vaga_id "
            + "JOIN empresas e ON e.id = v.empresa_id ";

    public void inserir(ProcessoSeletivo processo) throws SQLException {
        String sql = "INSERT INTO processos_seletivos (candidatura_id, situacao, observacao) VALUES (?, ?, ?)";
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, processo.getCandidaturaId());
            ps.setString(2, processo.getSituacao() == null ? "Em andamento" : processo.getSituacao());
            ps.setString(3, processo.getObservacao());
            ps.executeUpdate();
            try (ResultSet chaves = ps.getGeneratedKeys()) {
                if (chaves.next()) {
                    processo.setId(chaves.getInt(1));
                }
            }
        }
    }

    public ProcessoSeletivo buscarPorId(int id) throws SQLException {
        List<ProcessoSeletivo> lista = consultar(SELECT + "WHERE p.id = ?", id);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public ProcessoSeletivo buscarPorCandidatura(int candidaturaId) throws SQLException {
        List<ProcessoSeletivo> lista = consultar(SELECT + "WHERE p.candidatura_id = ?", candidaturaId);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public List<ProcessoSeletivo> listarPorCandidato(int candidatoId) throws SQLException {
        return consultar(SELECT + "WHERE ca.candidato_id = ? ORDER BY p.id DESC", candidatoId);
    }

    public List<ProcessoSeletivo> listarPorEmpresa(int empresaId) throws SQLException {
        return consultar(SELECT + "WHERE v.empresa_id = ? ORDER BY p.id DESC", empresaId);
    }

    public boolean atualizar(ProcessoSeletivo processo) throws SQLException {
        String sql = "UPDATE processos_seletivos SET situacao = ?, observacao = ? WHERE id = ?";
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, processo.getSituacao());
            ps.setString(2, processo.getObservacao());
            ps.setInt(3, processo.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("DELETE FROM processos_seletivos WHERE id = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private List<ProcessoSeletivo> consultar(String sql, int parametro) throws SQLException {
        List<ProcessoSeletivo> lista = new ArrayList<>();
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

    private ProcessoSeletivo mapear(ResultSet rs) throws SQLException {
        ProcessoSeletivo p = new ProcessoSeletivo();
        p.setId(rs.getInt("id"));
        p.setCandidaturaId(rs.getInt("candidatura_id"));
        p.setSituacao(rs.getString("situacao"));
        p.setObservacao(rs.getString("observacao"));
        p.setCandidatoNome(rs.getString("candidato_nome"));
        p.setVagaTitulo(rs.getString("vaga_titulo"));
        p.setEmpresaNome(rs.getString("empresa_nome"));
        return p;
    }
}
