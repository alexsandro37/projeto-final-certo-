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
<<<<<<< HEAD
        System.out.println("Banco em uso: " + new java.io.File("database/agencia_empregos.db").getAbsolutePath());
=======
>>>>>>> 746b9a529d57dc05dcaf7900f68636e2fbb8c37f
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
