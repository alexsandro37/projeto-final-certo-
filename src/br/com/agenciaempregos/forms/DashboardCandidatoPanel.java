package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.main.Sessao;

public class DashboardCandidatoPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public DashboardCandidatoPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e) {
                carregar();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCabecalho = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        pnlConteudo = new javax.swing.JPanel();
        lblSaudacao = new javax.swing.JLabel();
        pnlCartoes = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JButton();
        btnBuscarVagas = new javax.swing.JButton();
        btnCandidaturas = new javax.swing.JButton();
        btnProcessos = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Área do Candidato");
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 22));
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        pnlCabecalho.add(lblTitulo, java.awt.BorderLayout.WEST);
        btnSair.setText("Sair");
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnSair.setBackground(new java.awt.Color(46, 134, 222));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setOpaque(true);
        btnSair.setBorderPainted(false);
        btnSair.setFocusPainted(false);
        btnSair.setPreferredSize(new java.awt.Dimension(185, 34));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlCabecalho.add(btnSair, java.awt.BorderLayout.EAST);
        add(pnlCabecalho, java.awt.BorderLayout.NORTH);
        pnlConteudo.setBackground(new java.awt.Color(244, 246, 248));
        pnlConteudo.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 30, 40));
        pnlConteudo.setLayout(new java.awt.BorderLayout(0, 20));
        lblSaudacao.setText("O que você quer fazer hoje?");
        lblSaudacao.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblSaudacao.setForeground(new java.awt.Color(108, 117, 125));
        pnlConteudo.add(lblSaudacao, java.awt.BorderLayout.NORTH);
        pnlCartoes.setBackground(new java.awt.Color(244, 246, 248));
        pnlCartoes.setLayout(new java.awt.GridLayout(2, 2, 20, 20));
        btnPerfil.setText("Meu perfil");
        btnPerfil.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnPerfil.setBackground(new java.awt.Color(46, 134, 222));
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setOpaque(true);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setFocusPainted(false);
        btnPerfil.setPreferredSize(new java.awt.Dimension(200, 100));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        pnlCartoes.add(btnPerfil);
        btnBuscarVagas.setText("Buscar vagas");
        btnBuscarVagas.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnBuscarVagas.setBackground(new java.awt.Color(46, 134, 222));
        btnBuscarVagas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVagas.setOpaque(true);
        btnBuscarVagas.setBorderPainted(false);
        btnBuscarVagas.setFocusPainted(false);
        btnBuscarVagas.setPreferredSize(new java.awt.Dimension(200, 100));
        btnBuscarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVagasActionPerformed(evt);
            }
        });
        pnlCartoes.add(btnBuscarVagas);
        btnCandidaturas.setText("Minhas candidaturas");
        btnCandidaturas.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnCandidaturas.setBackground(new java.awt.Color(46, 134, 222));
        btnCandidaturas.setForeground(new java.awt.Color(255, 255, 255));
        btnCandidaturas.setOpaque(true);
        btnCandidaturas.setBorderPainted(false);
        btnCandidaturas.setFocusPainted(false);
        btnCandidaturas.setPreferredSize(new java.awt.Dimension(200, 100));
        btnCandidaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidaturasActionPerformed(evt);
            }
        });
        pnlCartoes.add(btnCandidaturas);
        btnProcessos.setText("Processos seletivos");
        btnProcessos.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnProcessos.setBackground(new java.awt.Color(46, 134, 222));
        btnProcessos.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessos.setOpaque(true);
        btnProcessos.setBorderPainted(false);
        btnProcessos.setFocusPainted(false);
        btnProcessos.setPreferredSize(new java.awt.Dimension(200, 100));
        btnProcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessosActionPerformed(evt);
            }
        });
        pnlCartoes.add(btnProcessos);
        pnlConteudo.add(pnlCartoes, java.awt.BorderLayout.CENTER);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sessao.limpar();
        tela.mostrar(TelaPrincipal.LOGIN);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        tela.mostrar(TelaPrincipal.PERFIL_CANDIDATO);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnBuscarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVagasActionPerformed
        tela.mostrar(TelaPrincipal.BUSCAR_VAGAS);
    }//GEN-LAST:event_btnBuscarVagasActionPerformed

    private void btnCandidaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidaturasActionPerformed
        tela.mostrar(TelaPrincipal.MINHAS_CANDIDATURAS);
    }//GEN-LAST:event_btnCandidaturasActionPerformed

    private void btnProcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessosActionPerformed
        tela.mostrar(TelaPrincipal.PROCESSOS_CANDIDATO);
    }//GEN-LAST:event_btnProcessosActionPerformed


    private void carregar() {
        if (Sessao.usuario != null) {
            lblSaudacao.setText("Olá, " + Sessao.usuario.getNome() + "! O que você quer fazer hoje?");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVagas;
    private javax.swing.JButton btnCandidaturas;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProcessos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCartoes;
    private javax.swing.JPanel pnlConteudo;
    // End of variables declaration//GEN-END:variables
}
