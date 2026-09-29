package br.com.agenciaempregos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoSQLite {

    private static final String URL = "jdbc:sqlite:database/agencia_empregos.db";

    public static Connection conectar() throws SQLException {
        Connection conexao = DriverManager.getConnection(URL);
        try (Statement comando = conexao.createStatement()) {
            comando.execute("PRAGMA foreign_keys = ON");
        }
        return conexao;
    }
}
