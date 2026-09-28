package br.com.agenciaempregos.dao;

import br.com.agenciaempregos.database.ConexaoSQLite;
import br.com.agenciaempregos.model.Usuario;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public static String gerarHash(String senha) {
        try {
            byte[] bytes = MessageDigest.getInstance("SHA-256").digest(senha.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder();
            for (byte b : bytes) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, gerarHash(usuario.getSenha()));
            ps.executeUpdate();
            try (ResultSet chaves = ps.getGeneratedKeys()) {
                if (chaves.next()) {
                    usuario.setId(chaves.getInt(1));
                }
            }
        }
    }

    public Usuario buscarPorId(int id) throws SQLException {
        return buscarUm("SELECT * FROM usuarios WHERE id = ?", id);
    }

    public Usuario buscarPorEmail(String email) throws SQLException {
        return buscarUm("SELECT * FROM usuarios WHERE email = ?", email);
    }

    public Usuario autenticar(String email, String senha) throws SQLException {
        Usuario usuario = buscarPorEmail(email);
        if (usuario != null && usuario.getSenha().equals(gerarHash(senha))) {
            return usuario;
        }
        return null;
    }

    public List<Usuario> listar() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
        try (Connection c = ConexaoSQLite.conectar();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM usuarios ORDER BY nome")) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public boolean atualizar(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuarios SET nome = ?, email = ? WHERE id = ?";
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean alterarSenha(int id, String novaSenha) throws SQLException {
        String sql = "UPDATE usuarios SET senha = ? WHERE id = ?";
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, gerarHash(novaSenha));
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean excluir(int id) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar();
                PreparedStatement ps = c.prepareStatement("DELETE FROM usuarios WHERE id = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private Usuario buscarUm(String sql, Object parametro) throws SQLException {
        try (Connection c = ConexaoSQLite.conectar(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setObject(1, parametro);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? mapear(rs) : null;
            }
        }
    }

    private Usuario mapear(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();
        u.setId(rs.getInt("id"));
        u.setNome(rs.getString("nome"));
        u.setEmail(rs.getString("email"));
        u.setSenha(rs.getString("senha"));
        return u;
    }
}
