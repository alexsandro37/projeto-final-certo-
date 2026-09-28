package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.UsuarioDAO;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroUsuarioPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public CadastroUsuarioPanel(TelaPrincipal tela) {
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
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JPasswordField();
        lblConfirmarSenha = new javax.swing.JLabel();
        pwdConfirmarSenha = new javax.swing.JPasswordField();
        pnlBotoes = new javax.swing.JPanel();
        btnCriarConta = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlFundo.setBackground(new java.awt.Color(244, 246, 248));
        pnlFundo.setLayout(new java.awt.GridBagLayout());
        pnlCartao.setBackground(new java.awt.Color(255, 255, 255));
        pnlCartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 30, 40));
        pnlCartao.setLayout(new java.awt.GridBagLayout());
        lblTitulo.setText("Criar conta");
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 26));
        lblTitulo.setForeground(new java.awt.Color(31, 78, 121));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnlCartao.add(lblTitulo, gridBagConstraints);
        lblNome.setText("Nome");
        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblNome.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblNome, gridBagConstraints);
        txtNome.setColumns(22);
        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtNome, gridBagConstraints);
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
        lblConfirmarSenha.setText("Confirmar senha");
        lblConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblConfirmarSenha.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblConfirmarSenha, gridBagConstraints);
        pwdConfirmarSenha.setColumns(22);
        pwdConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(pwdConfirmarSenha, gridBagConstraints);
        pnlBotoes.setBackground(new java.awt.Color(255, 255, 255));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));
        btnCriarConta.setText("Criar conta");
        btnCriarConta.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnCriarConta.setBackground(new java.awt.Color(46, 134, 222));
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
        pnlBotoes.add(btnVoltar);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        pnlCartao.add(pnlBotoes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlFundo.add(pnlCartao, gridBagConstraints);
        add(pnlFundo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        String nome = txtNome.getText().trim();
        String email = txtEmail.getText().trim();
        String senha = new String(pwdSenha.getPassword());
        String confirmar = new String(pwdConfirmarSenha.getPassword());
        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!email.matches("[^@\\s]+@[^@\\s]+\\.[^@\\s]+")) {
            JOptionPane.showMessageDialog(this, "E-mail inválido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!senha.equals(confirmar)) {
            JOptionPane.showMessageDialog(this, "As senhas não conferem.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            UsuarioDAO dao = new UsuarioDAO();
            if (dao.buscarPorEmail(email) != null) {
                JOptionPane.showMessageDialog(this, "Já existe uma conta com este e-mail.", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            dao.inserir(usuario);
            JOptionPane.showMessageDialog(this, "Dado cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
            tela.mostrar(TelaPrincipal.LOGIN);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        limparCampos();
        tela.mostrar(TelaPrincipal.LOGIN);
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        pwdSenha.setText("");
        pwdConfirmarSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPasswordField pwdConfirmarSenha;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
