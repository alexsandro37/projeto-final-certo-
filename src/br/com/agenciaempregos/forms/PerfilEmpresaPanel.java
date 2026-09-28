package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;

public class PerfilEmpresaPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public PerfilEmpresaPanel(TelaPrincipal tela) {
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
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblSobre = new javax.swing.JLabel();
        scrSobre = new javax.swing.JScrollPane();
        txaSobre = new javax.swing.JTextArea();
        pnlBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Perfil da empresa");
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
        pnlConteudo.setLayout(new java.awt.BorderLayout(0, 15));
        pnlCartao.setBackground(new java.awt.Color(255, 255, 255));
        pnlCartao.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 30, 25, 30));
        pnlCartao.setLayout(new java.awt.GridBagLayout());
        lblNome.setText("Nome da empresa");
        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblNome.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblNome, gridBagConstraints);
        txtNome.setColumns(22);
        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtNome, gridBagConstraints);
        lblCnpj.setText("CNPJ");
        lblCnpj.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblCnpj.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblCnpj, gridBagConstraints);
        txtCnpj.setColumns(22);
        txtCnpj.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtCnpj, gridBagConstraints);
        lblArea.setText("Área de atuação");
        lblArea.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblArea.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblArea, gridBagConstraints);
        cmbArea.setFont(new java.awt.Font("Tahoma", 0, 14));
        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologia", "Saúde", "Educação", "Administração", "Vendas", "Engenharia", "Marketing", "Financeiro" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(cmbArea, gridBagConstraints);
        lblTelefone.setText("Telefone");
        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblTelefone.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblTelefone, gridBagConstraints);
        txtTelefone.setColumns(22);
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(txtTelefone, gridBagConstraints);
        lblSobre.setText("Sobre a empresa");
        lblSobre.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSobre.setForeground(new java.awt.Color(33, 37, 41));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(lblSobre, gridBagConstraints);
        txaSobre.setColumns(20);
        txaSobre.setRows(6);
        txaSobre.setLineWrap(true);
        txaSobre.setWrapStyleWord(true);
        txaSobre.setEditable(true);
        txaSobre.setFont(new java.awt.Font("Tahoma", 0, 14));
        scrSobre.setViewportView(txaSobre);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        pnlCartao.add(scrSobre, gridBagConstraints);
        pnlConteudo.add(pnlCartao, java.awt.BorderLayout.CENTER);
        pnlBotoes.setBackground(new java.awt.Color(244, 246, 248));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        btnSalvar.setText("Salvar perfil");
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnSalvar.setBackground(new java.awt.Color(46, 134, 222));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setOpaque(true);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setFocusPainted(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(150, 36));
        pnlBotoes.add(btnSalvar);
        pnlConteudo.add(pnlBotoes, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_EMPRESA);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCartao;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrSobre;
    private javax.swing.JTextArea txaSobre;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
