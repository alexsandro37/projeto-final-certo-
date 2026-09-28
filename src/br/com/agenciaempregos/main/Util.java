package br.com.agenciaempregos.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Util {

    public static void preencher(JTable tabela, List<Object[]> linhas) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Object[] linha : linhas) {
            modelo.addRow(linha);
        }
    }

    public static String data(String iso) {
        if (iso == null) {
            return "";
        }
        try {
            return LocalDate.parse(iso).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (RuntimeException e) {
            return iso;
        }
    }

    public static String texto(String valor) {
        return valor == null ? "" : valor;
    }

    public static void selecionar(javax.swing.JComboBox<String> combo, String valor) {
        if (valor == null) {
            combo.setSelectedIndex(0);
        } else {
            combo.setSelectedItem(valor);
        }
    }

    public static String moeda(Double valor) {
        return valor == null ? "" : NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor);
    }

    public static void erro(java.awt.Component pai, Exception e) {
        JOptionPane.showMessageDialog(pai, "Erro ao acessar o banco de dados:\n" + e.getMessage(), "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    public static boolean duplicado(Exception e) {
        return e.getMessage() != null && e.getMessage().contains("UNIQUE");
    }
}
