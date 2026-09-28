package br.com.agenciaempregos.database;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDados {

    private static final String SCRIPT = "database/banco.sql";

    public static void inicializar() throws SQLException, IOException {
        String script = new String(Files.readAllBytes(Paths.get(SCRIPT)), StandardCharsets.UTF_8);
        try (Connection conexao = ConexaoSQLite.conectar();
                Statement comando = conexao.createStatement()) {
            for (String instrucao : script.split(";")) {
                if (!instrucao.trim().isEmpty()) {
                    comando.execute(instrucao);
                }
            }
        }
    }
}
