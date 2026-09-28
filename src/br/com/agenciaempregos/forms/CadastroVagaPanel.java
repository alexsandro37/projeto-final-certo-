package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.VagaDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Vaga;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroVagaPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public CadastroVagaPanel(TelaPrincipal tela) {
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
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
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
        Sessao.vagaEmEdicao = null;
        tela.mostrar(TelaPrincipal.MINHAS_VAGAS);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Sessao.vagaEmEdicao = null;
        tela.mostrar(TelaPrincipal.MINHAS_VAGAS);
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String titulo = txtTitulo.getText().trim();
        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o título da vaga.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Double salario = null;
        String textoSalario = txtSalario.getText().trim();
        if (!textoSalario.isEmpty()) {
            try {
                if (textoSalario.contains(",")) {
                    textoSalario = textoSalario.replace(".", "").replace(",", ".");
                }
                salario = Double.parseDouble(textoSalario);
            } catch (NumberFormatException e) {
                salario = -1.0;
            }
            if (salario < 0) {
                JOptionPane.showMessageDialog(this, "Informe um salário válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        Vaga vaga = Sessao.vagaEmEdicao != null ? Sessao.vagaEmEdicao : new Vaga();
        vaga.setEmpresaId(Sessao.empresa.getId());
        vaga.setTitulo(titulo);
        vaga.setDescricao(txaDescricao.getText().trim());
        vaga.setArea((String) cmbArea.getSelectedItem());
        vaga.setCidade(txtCidade.getText().trim());
        vaga.setSalario(salario);
        try {
            VagaDAO dao = new VagaDAO();
            if (vaga.getId() == 0) {
                dao.inserir(vaga);
            } else {
                dao.atualizar(vaga);
            }
            Sessao.vagaEmEdicao = null;
            JOptionPane.showMessageDialog(this, "Dado cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            tela.mostrar(TelaPrincipal.MINHAS_VAGAS);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void carregar() {
        Vaga vaga = Sessao.vagaEmEdicao;
        lblTitulo.setText(vaga == null ? "Cadastro de vaga" : "Alterar vaga");
        txtTitulo.setText(vaga == null ? "" : vaga.getTitulo());
        txaDescricao.setText(vaga == null ? "" : Util.texto(vaga.getDescricao()));
        Util.selecionar(cmbArea, vaga == null ? null : vaga.getArea());
        txtCidade.setText(vaga == null ? "" : Util.texto(vaga.getCidade()));
        txtSalario.setText(vaga == null || vaga.getSalario() == null ? "" : String.valueOf(vaga.getSalario()));
    }

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
