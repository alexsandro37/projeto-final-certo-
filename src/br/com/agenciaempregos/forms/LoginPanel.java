package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.UsuarioDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public LoginPanel(TelaPrincipal tela) {
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
        lblSubtitulo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JPasswordField();
        pnlBotoes = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        btnCriarConta = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlFundo.setBackground(new java.awt.Color(244, 246, 248));
        pnlFundo.setLayout(new java.awt.GridBagLayout());
        pnlCartao.setBackground(new java.awt.Color(255, 255, 255));
        pnlCartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 30, 40));
        pnlCartao.setLayout(new java.awt.GridBagLayout());
        lblTitulo.setText("Agência de Empregos");
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(31, 78, 121));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlCartao.add(lblTitulo, gridBagConstraints);
        lblSubtitulo.setText("Acesse a sua conta");
        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSubtitulo.setForeground(new java.awt.Color(108, 117, 125));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnlCartao.add(lblSubtitulo, gridBagConstraints);
        lblEmail.setText("E-mail");
        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblEmail.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblEmail, gridBagConstraints);
        txtEmail.setColumns(22);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtEmail, gridBagConstraints);
        lblSenha.setText("Senha");
        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSenha.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblSenha, gridBagConstraints);
        pwdSenha.setColumns(22);
        pwdSenha.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(pwdSenha, gridBagConstraints);
        pnlBotoes.setBackground(new java.awt.Color(255, 255, 255));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));
        btnEntrar.setText("Entrar");
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnEntrar.setBackground(new java.awt.Color(46, 134, 222));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setOpaque(true);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setPreferredSize(new java.awt.Dimension(150, 36));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnEntrar);
        btnCriarConta.setText("Criar conta");
        btnCriarConta.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnCriarConta.setBackground(new java.awt.Color(108, 117, 125));
        btnCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setOpaque(true);
        btnCriarConta.setBorderPainted(false);
        btnCriarConta.setFocusPainted(false);
        btnCriarConta.setPreferredSize(new java.awt.Dimension(150, 36));
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCriarConta);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        pnlCartao.add(pnlBotoes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlFundo.add(pnlCartao, gridBagConstraints);
        add(pnlFundo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String email = txtEmail.getText().trim();
        String senha = new String(pwdSenha.getPassword());
        if (email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o e-mail e a senha.", "Login", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            Usuario usuario = new UsuarioDAO().autenticar(email, senha);
            if (usuario == null) {
                JOptionPane.showMessageDialog(this, "E-mail ou senha incorretos.", "Login", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Sessao.limpar();
            Sessao.usuario = usuario;
            txtEmail.setText("");
            pwdSenha.setText("");
            tela.mostrar(TelaPrincipal.ESCOLHA_ACESSO);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        tela.mostrar(TelaPrincipal.CADASTRO_USUARIO);
    }//GEN-LAST:event_btnCriarContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
