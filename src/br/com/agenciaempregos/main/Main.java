package br.com.agenciaempregos.main;

import br.com.agenciaempregos.database.BancoDados;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        try {
            BancoDados.inicializar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o banco de dados:\n" + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Banco em uso: " + new java.io.File("database/agencia_empregos.db").getAbsolutePath());
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
