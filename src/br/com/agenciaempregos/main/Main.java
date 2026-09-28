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
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
