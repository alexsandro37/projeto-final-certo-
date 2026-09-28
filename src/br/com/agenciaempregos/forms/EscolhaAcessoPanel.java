package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.CandidatoDAO;
import br.com.agenciaempregos.dao.EmpresaDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Candidato;
import java.sql.SQLException;

public class EscolhaAcessoPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public EscolhaAcessoPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        java.awt.GridBagConstraints gridBagConstraints;

        pnlFundo = new javax.swing.JPanel();
        pnlCartao = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCandidato = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlFundo.setBackground(new java.awt.Color(244, 246, 248));
        pnlFundo.setLayout(new java.awt.GridBagLayout());
        pnlCartao.setBackground(new java.awt.Color(255, 255, 255));
        pnlCartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 50, 35, 50));
        pnlCartao.setLayout(new java.awt.GridBagLayout());
        lblTitulo.setText("Como você quer entrar?");
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblTitulo.setForeground(new java.awt.Color(31, 78, 121));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        pnlCartao.add(lblTitulo, gridBagConstraints);
        btnCandidato.setText("ENTRAR COMO CANDIDATO");
        btnCandidato.setFont(new java.awt.Font("Tahoma", 1, 15));
        btnCandidato.setBackground(new java.awt.Color(46, 134, 222));
        btnCandidato.setForeground(new java.awt.Color(255, 255, 255));
        btnCandidato.setOpaque(true);
        btnCandidato.setBorderPainted(false);
        btnCandidato.setFocusPainted(false);
        btnCandidato.setPreferredSize(new java.awt.Dimension(320, 64));
        btnCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        pnlCartao.add(btnCandidato, gridBagConstraints);
        btnEmpresa.setText("ENTRAR COMO EMPRESA");
        btnEmpresa.setFont(new java.awt.Font("Tahoma", 1, 15));
        btnEmpresa.setBackground(new java.awt.Color(46, 134, 222));
        btnEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpresa.setOpaque(true);
        btnEmpresa.setBorderPainted(false);
        btnEmpresa.setFocusPainted(false);
        btnEmpresa.setPreferredSize(new java.awt.Dimension(320, 64));
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        pnlCartao.add(btnEmpresa, gridBagConstraints);
        btnVoltar.setText("Voltar");
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnVoltar.setBackground(new java.awt.Color(108, 117, 125));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setOpaque(true);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setFocusPainted(false);
        btnVoltar.setPreferredSize(new java.awt.Dimension(150, 36));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pnlCartao.add(btnVoltar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlFundo.add(pnlCartao, gridBagConstraints);
        add(pnlFundo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatoActionPerformed
        try {
            CandidatoDAO dao = new CandidatoDAO();
            Candidato candidato = dao.buscarPorUsuario(Sessao.usuario.getId());
            if (candidato == null) {
                candidato = new Candidato();
                candidato.setUsuarioId(Sessao.usuario.getId());
                dao.inserir(candidato);
            }
            Sessao.candidato = candidato;
            tela.mostrar(TelaPrincipal.DASHBOARD_CANDIDATO);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnCandidatoActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        try {
            Sessao.empresa = new EmpresaDAO().buscarPorUsuario(Sessao.usuario.getId());
            tela.mostrar(TelaPrincipal.DASHBOARD_EMPRESA);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Sessao.limpar();
        tela.mostrar(TelaPrincipal.LOGIN);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandidato;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables
}
