package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.ProcessoSeletivoDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.ProcessoSeletivo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProcessosSeletivosEmpresaPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;
    private List<ProcessoSeletivo> processos = new ArrayList<>();

    public ProcessosSeletivosEmpresaPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
        tblProcessos.getSelectionModel().addListSelectionListener(e -> {
            int linha = tblProcessos.getSelectedRow();
            if (linha >= 0) {
                ProcessoSeletivo processo = processos.get(tblProcessos.convertRowIndexToModel(linha));
                cmbSituacao.setSelectedItem(processo.getSituacao());
                txtObservacao.setText(Util.texto(processo.getObservacao()));
            }
        });
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
        btnVoltar = new javax.swing.JButton();
        pnlConteudo = new javax.swing.JPanel();
        scrProcessos = new javax.swing.JScrollPane();
        tblProcessos = new javax.swing.JTable();
        pnlAtualizar = new javax.swing.JPanel();
        lblSituacao = new javax.swing.JLabel();
        cmbSituacao = new javax.swing.JComboBox<>();
        lblObservacao = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        btnAtualizarProcesso = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Processos seletivos");
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
        tblProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidato", "Vaga", "Situação", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcessos.setRowHeight(26);
        tblProcessos.setFillsViewportHeight(true);
        scrProcessos.setViewportView(tblProcessos);
        pnlConteudo.add(scrProcessos, java.awt.BorderLayout.CENTER);
        pnlAtualizar.setBackground(new java.awt.Color(244, 246, 248));
        pnlAtualizar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        lblSituacao.setText("Situação:");
        lblSituacao.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblSituacao.setForeground(new java.awt.Color(33, 37, 41));
        pnlAtualizar.add(lblSituacao);
        cmbSituacao.setFont(new java.awt.Font("Tahoma", 0, 14));
        cmbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Aprovado", "Reprovado" }));
        pnlAtualizar.add(cmbSituacao);
        lblObservacao.setText("Observação:");
        lblObservacao.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblObservacao.setForeground(new java.awt.Color(33, 37, 41));
        pnlAtualizar.add(lblObservacao);
        txtObservacao.setColumns(24);
        txtObservacao.setFont(new java.awt.Font("Tahoma", 0, 14));
        pnlAtualizar.add(txtObservacao);
        btnAtualizarProcesso.setText("Atualizar processo");
        btnAtualizarProcesso.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnAtualizarProcesso.setBackground(new java.awt.Color(46, 134, 222));
        btnAtualizarProcesso.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarProcesso.setOpaque(true);
        btnAtualizarProcesso.setBorderPainted(false);
        btnAtualizarProcesso.setFocusPainted(false);
        btnAtualizarProcesso.setPreferredSize(new java.awt.Dimension(190, 34));
        btnAtualizarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProcessoActionPerformed(evt);
            }
        });
        pnlAtualizar.add(btnAtualizarProcesso);
        pnlConteudo.add(pnlAtualizar, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_EMPRESA);
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void btnAtualizarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProcessoActionPerformed
        int linha = tblProcessos.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um processo na tabela.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ProcessoSeletivo processo = processos.get(tblProcessos.convertRowIndexToModel(linha));
        processo.setSituacao((String) cmbSituacao.getSelectedItem());
        processo.setObservacao(txtObservacao.getText().trim());
        try {
            new ProcessoSeletivoDAO().atualizar(processo);
            JOptionPane.showMessageDialog(this, "Processo atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            carregar();
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnAtualizarProcessoActionPerformed

    private void carregar() {
        if (Sessao.empresa == null) {
            return;
        }
        try {
            processos = new ProcessoSeletivoDAO().listarPorEmpresa(Sessao.empresa.getId());
            List<Object[]> linhas = new ArrayList<>();
            for (ProcessoSeletivo p : processos) {
                linhas.add(new Object[]{p.getCandidatoNome(), p.getVagaTitulo(), p.getSituacao(), Util.texto(p.getObservacao())});
            }
            Util.preencher(tblProcessos, linhas);
            txtObservacao.setText("");
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarProcesso;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbSituacao;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAtualizar;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrProcessos;
    private javax.swing.JTable tblProcessos;
    private javax.swing.JTextField txtObservacao;
    // End of variables declaration//GEN-END:variables
}
