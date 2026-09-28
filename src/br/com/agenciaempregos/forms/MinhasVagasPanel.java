package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;

public class MinhasVagasPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public MinhasVagasPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCabecalho = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        pnlConteudo = new javax.swing.JPanel();
        scrVagas = new javax.swing.JScrollPane();
        tblVagas = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnNovaVaga = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Minhas vagas");
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 22));
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        pnlCabecalho.add(lblTitulo, java.awt.BorderLayout.WEST);
        btnVoltar.setText("Voltar ao painel");
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnVoltar.setBackground(new java.awt.Color(46, 134, 222));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setOpaque(true);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setFocusPainted(false);
        btnVoltar.setPreferredSize(new java.awt.Dimension(185, 34));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlCabecalho.add(btnVoltar, java.awt.BorderLayout.EAST);
        add(pnlCabecalho, java.awt.BorderLayout.NORTH);
        pnlConteudo.setBackground(new java.awt.Color(244, 246, 248));
        pnlConteudo.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 25, 20, 25));
        pnlConteudo.setLayout(new java.awt.BorderLayout(0, 10));
        tblVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Área", "Cidade", "Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVagas.setRowHeight(26);
        tblVagas.setFillsViewportHeight(true);
        scrVagas.setViewportView(tblVagas);
        pnlConteudo.add(scrVagas, java.awt.BorderLayout.CENTER);
        pnlBotoes.setBackground(new java.awt.Color(244, 246, 248));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        btnNovaVaga.setText("Nova vaga");
        btnNovaVaga.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnNovaVaga.setBackground(new java.awt.Color(46, 134, 222));
        btnNovaVaga.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaVaga.setOpaque(true);
        btnNovaVaga.setBorderPainted(false);
        btnNovaVaga.setFocusPainted(false);
        btnNovaVaga.setPreferredSize(new java.awt.Dimension(150, 36));
        btnNovaVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVagaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnNovaVaga);
        btnAlterar.setText("Alterar");
        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnAlterar.setBackground(new java.awt.Color(108, 117, 125));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setOpaque(true);
        btnAlterar.setBorderPainted(false);
        btnAlterar.setFocusPainted(false);
        btnAlterar.setPreferredSize(new java.awt.Dimension(150, 36));
        pnlBotoes.add(btnAlterar);
        btnExcluir.setText("Excluir");
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnExcluir.setBackground(new java.awt.Color(192, 57, 43));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setOpaque(true);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setFocusPainted(false);
        btnExcluir.setPreferredSize(new java.awt.Dimension(150, 36));
        pnlBotoes.add(btnExcluir);
        pnlConteudo.add(pnlBotoes, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_EMPRESA);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovaVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVagaActionPerformed
        tela.mostrar(TelaPrincipal.CADASTRO_VAGA);
    }//GEN-LAST:event_btnNovaVagaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovaVaga;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrVagas;
    private javax.swing.JTable tblVagas;
    // End of variables declaration//GEN-END:variables
}
