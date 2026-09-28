package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.CandidaturaDAO;
import br.com.agenciaempregos.dao.ProcessoSeletivoDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Candidatura;
import br.com.agenciaempregos.model.ProcessoSeletivo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CandidaturasEmpresaPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;
    private List<Candidatura> candidaturas = new ArrayList<>();

    public CandidaturasEmpresaPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
        tblCandidaturas.getSelectionModel().addListSelectionListener(e -> {
            int linha = tblCandidaturas.getSelectedRow();
            if (linha >= 0) {
                cmbStatus.setSelectedItem(candidaturas.get(tblCandidaturas.convertRowIndexToModel(linha)).getStatus());
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
        scrCandidaturas = new javax.swing.JScrollPane();
        tblCandidaturas = new javax.swing.JTable();
        pnlAtualizar = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        btnAtualizarStatus = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Candidaturas recebidas");
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
        tblCandidaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidato", "Vaga", "Data", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCandidaturas.setRowHeight(26);
        tblCandidaturas.setFillsViewportHeight(true);
        scrCandidaturas.setViewportView(tblCandidaturas);
        pnlConteudo.add(scrCandidaturas, java.awt.BorderLayout.CENTER);
        pnlAtualizar.setBackground(new java.awt.Color(244, 246, 248));
        pnlAtualizar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        lblStatus.setText("Novo status:");
        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblStatus.setForeground(new java.awt.Color(33, 37, 41));
        pnlAtualizar.add(lblStatus);
        cmbStatus.setFont(new java.awt.Font("Tahoma", 0, 14));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Candidatura realizada", "Em análise", "Em processo seletivo", "Resultado" }));
        pnlAtualizar.add(cmbStatus);
        btnAtualizarStatus.setText("Atualizar status");
        btnAtualizarStatus.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnAtualizarStatus.setBackground(new java.awt.Color(46, 134, 222));
        btnAtualizarStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarStatus.setOpaque(true);
        btnAtualizarStatus.setBorderPainted(false);
        btnAtualizarStatus.setFocusPainted(false);
        btnAtualizarStatus.setPreferredSize(new java.awt.Dimension(175, 34));
        btnAtualizarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarStatusActionPerformed(evt);
            }
        });
        pnlAtualizar.add(btnAtualizarStatus);
        pnlConteudo.add(pnlAtualizar, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_EMPRESA);
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void btnAtualizarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarStatusActionPerformed
        int linha = tblCandidaturas.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma candidatura na tabela.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Candidatura candidatura = candidaturas.get(tblCandidaturas.convertRowIndexToModel(linha));
        String status = (String) cmbStatus.getSelectedItem();
        try {
            new CandidaturaDAO().atualizarStatus(candidatura.getId(), status);
            ProcessoSeletivoDAO processos = new ProcessoSeletivoDAO();
            if (status.equals("Em processo seletivo") && processos.buscarPorCandidatura(candidatura.getId()) == null) {
                ProcessoSeletivo processo = new ProcessoSeletivo();
                processo.setCandidaturaId(candidatura.getId());
                processos.inserir(processo);
            }
            JOptionPane.showMessageDialog(this, "Status atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            carregar();
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnAtualizarStatusActionPerformed

    private void carregar() {
        if (Sessao.empresa == null) {
            return;
        }
        try {
            candidaturas = new CandidaturaDAO().listarPorEmpresa(Sessao.empresa.getId());
            List<Object[]> linhas = new ArrayList<>();
            for (Candidatura c : candidaturas) {
                linhas.add(new Object[]{c.getCandidatoNome(), c.getVagaTitulo(), Util.data(c.getDataCandidatura()), c.getStatus()});
            }
            Util.preencher(tblCandidaturas, linhas);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarStatus;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAtualizar;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrCandidaturas;
    private javax.swing.JTable tblCandidaturas;
    // End of variables declaration//GEN-END:variables
}
