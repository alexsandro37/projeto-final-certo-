package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.main.Sessao;
import javax.swing.JOptionPane;

public class DashboardEmpresaPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public DashboardEmpresaPanel(TelaPrincipal tela) {
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
        btnMinhasVagas = new javax.swing.JButton();
        btnCandidaturas = new javax.swing.JButton();
        btnProcessos = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Área da Empresa");
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
        btnPerfil.setText("Perfil da empresa");
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
        btnMinhasVagas.setText("Minhas vagas");
        btnMinhasVagas.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnMinhasVagas.setBackground(new java.awt.Color(46, 134, 222));
        btnMinhasVagas.setForeground(new java.awt.Color(255, 255, 255));
        btnMinhasVagas.setOpaque(true);
        btnMinhasVagas.setBorderPainted(false);
        btnMinhasVagas.setFocusPainted(false);
        btnMinhasVagas.setPreferredSize(new java.awt.Dimension(200, 100));
        btnMinhasVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinhasVagasActionPerformed(evt);
            }
        });
        pnlCartoes.add(btnMinhasVagas);
        btnCandidaturas.setText("Candidaturas recebidas");
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
        tela.mostrar(TelaPrincipal.PERFIL_EMPRESA);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnMinhasVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinhasVagasActionPerformed
        if (Sessao.empresa == null) {
            JOptionPane.showMessageDialog(this, "Preencha o perfil da empresa antes de continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            tela.mostrar(TelaPrincipal.PERFIL_EMPRESA);
            return;
        }
        tela.mostrar(TelaPrincipal.MINHAS_VAGAS);
    }//GEN-LAST:event_btnMinhasVagasActionPerformed

    private void btnCandidaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidaturasActionPerformed
        if (Sessao.empresa == null) {
            JOptionPane.showMessageDialog(this, "Preencha o perfil da empresa antes de continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            tela.mostrar(TelaPrincipal.PERFIL_EMPRESA);
            return;
        }
        tela.mostrar(TelaPrincipal.CANDIDATURAS_EMPRESA);
    }//GEN-LAST:event_btnCandidaturasActionPerformed

    private void btnProcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessosActionPerformed
        if (Sessao.empresa == null) {
            JOptionPane.showMessageDialog(this, "Preencha o perfil da empresa antes de continuar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            tela.mostrar(TelaPrincipal.PERFIL_EMPRESA);
            return;
        }
        tela.mostrar(TelaPrincipal.PROCESSOS_EMPRESA);
    }//GEN-LAST:event_btnProcessosActionPerformed


    private void carregar() {
        if (Sessao.usuario != null) {
            lblSaudacao.setText("Olá, " + Sessao.usuario.getNome() + "! O que você quer fazer hoje?");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandidaturas;
    private javax.swing.JButton btnMinhasVagas;
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
