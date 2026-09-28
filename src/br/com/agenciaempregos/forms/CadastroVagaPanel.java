package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;

public class CadastroVagaPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public CadastroVagaPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        java.awt.GridBagConstraints gridBagConstraints;

        pnlCabecalho = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        pnlConteudo = new javax.swing.JPanel();
        pnlCartao = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        scrDescricao = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        pnlBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Cadastro de vaga");
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 22));
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        pnlCabecalho.add(lblTitulo, java.awt.BorderLayout.WEST);
        btnVoltar.setText("Voltar");
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
        pnlConteudo.setLayout(new java.awt.BorderLayout(0, 15));
        pnlCartao.setBackground(new java.awt.Color(255, 255, 255));
        pnlCartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 30, 25, 30));
        pnlCartao.setLayout(new java.awt.GridBagLayout());
        lblTitulo2.setText("Título da vaga");
        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblTitulo2.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblTitulo2, gridBagConstraints);
        txtTitulo.setColumns(22);
        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtTitulo, gridBagConstraints);
        lblArea.setText("Área");
        lblArea.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblArea.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblArea, gridBagConstraints);
        cmbArea.setFont(new java.awt.Font("Tahoma", 0, 14));
        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologia", "Saúde", "Educação", "Administração", "Vendas", "Engenharia", "Marketing", "Financeiro" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(cmbArea, gridBagConstraints);
        lblCidade.setText("Cidade");
        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCidade.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblCidade, gridBagConstraints);
        txtCidade.setColumns(22);
        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtCidade, gridBagConstraints);
        lblSalario.setText("Salário");
        lblSalario.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSalario.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblSalario, gridBagConstraints);
        txtSalario.setColumns(22);
        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtSalario, gridBagConstraints);
        lblDescricao.setText("Descrição");
        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblDescricao.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblDescricao, gridBagConstraints);
        txaDescricao.setColumns(20);
        txaDescricao.setRows(6);
        txaDescricao.setLineWrap(true);
        txaDescricao.setWrapStyleWord(true);
        txaDescricao.setEditable(true);
        txaDescricao.setFont(new java.awt.Font("Tahoma", 0, 14));
        scrDescricao.setViewportView(txaDescricao);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(scrDescricao, gridBagConstraints);
        pnlConteudo.add(pnlCartao, java.awt.BorderLayout.CENTER);
        pnlBotoes.setBackground(new java.awt.Color(244, 246, 248));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        btnSalvar.setText("Salvar vaga");
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnSalvar.setBackground(new java.awt.Color(46, 134, 222));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setOpaque(true);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setFocusPainted(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(150, 36));
        pnlBotoes.add(btnSalvar);
        btnCancelar.setText("Cancelar");
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnCancelar.setBackground(new java.awt.Color(108, 117, 125));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setOpaque(true);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 36));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar);
        pnlConteudo.add(pnlBotoes, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.MINHAS_VAGAS);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        tela.mostrar(TelaPrincipal.MINHAS_VAGAS);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrDescricao;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
