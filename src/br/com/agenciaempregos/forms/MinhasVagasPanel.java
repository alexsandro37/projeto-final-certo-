package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.VagaDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Vaga;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MinhasVagasPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;
    private List<Vaga> vagas = new ArrayList<>();

    public MinhasVagasPanel(TelaPrincipal tela) {
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
        btnVoltar = new javax.swing.JButton();
        pnlConteudo = new javax.swing.JPanel();
        scrVagas = new javax.swing.JScrollPane();
        tblVagas = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnNovaVaga = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Minhas vagas");
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
        tblVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Área", "Cidade", "Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVagas.setRowHeight(26);
        tblVagas.setFillsViewportHeight(true);
        scrVagas.setViewportView(tblVagas);
        pnlConteudo.add(scrVagas, java.awt.BorderLayout.CENTER);
        pnlBotoes.setBackground(new java.awt.Color(244, 246, 248));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        btnNovaVaga.setText("Nova vaga");
        btnNovaVaga.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnNovaVaga.setBackground(new java.awt.Color(46, 134, 222));
        btnNovaVaga.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaVaga.setOpaque(true);
        btnNovaVaga.setBorderPainted(false);
        btnNovaVaga.setFocusPainted(false);
        btnNovaVaga.setPreferredSize(new java.awt.Dimension(150, 36));
        btnNovaVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVagaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnNovaVaga);
        btnAlterar.setText("Alterar");
        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnAlterar.setBackground(new java.awt.Color(108, 117, 125));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setOpaque(true);
        btnAlterar.setBorderPainted(false);
        btnAlterar.setFocusPainted(false);
        btnAlterar.setPreferredSize(new java.awt.Dimension(150, 36));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnAlterar);
        btnExcluir.setText("Excluir");
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnExcluir.setBackground(new java.awt.Color(192, 57, 43));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setOpaque(true);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setFocusPainted(false);
        btnExcluir.setPreferredSize(new java.awt.Dimension(150, 36));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnExcluir);
        pnlConteudo.add(pnlBotoes, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_EMPRESA);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovaVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVagaActionPerformed
        if (Sessao.empresa == null) {
            JOptionPane.showMessageDialog(this, "Salve o perfil da empresa antes de cadastrar vagas.", "Atenção", JOptionPane.WARNING_MESSAGE);
            tela.mostrar(TelaPrincipal.PERFIL_EMPRESA);
            return;
        }
        Sessao.vagaEmEdicao = null;
        tela.mostrar(TelaPrincipal.CADASTRO_VAGA);
    }//GEN-LAST:event_btnNovaVagaActionPerformed


    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Vaga vaga = vagaSelecionada();
        if (vaga == null) {
            return;
        }
        Sessao.vagaEmEdicao = vaga;
        tela.mostrar(TelaPrincipal.CADASTRO_VAGA);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Vaga vaga = vagaSelecionada();
        if (vaga == null) {
            return;
        }
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este registro?",
                "Excluir vaga", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            new VagaDAO().excluir(vaga.getId());
            carregar();
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void carregar() {
        if (Sessao.empresa == null) {
            return;
        }
        try {
            vagas = new VagaDAO().listarPorEmpresa(Sessao.empresa.getId());
            List<Object[]> linhas = new ArrayList<>();
            for (Vaga v : vagas) {
                linhas.add(new Object[]{v.getTitulo(), v.getArea(), Util.texto(v.getCidade()), Util.moeda(v.getSalario())});
            }
            Util.preencher(tblVagas, linhas);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }

    private Vaga vagaSelecionada() {
        int linha = tblVagas.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma vaga na tabela.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        return vagas.get(tblVagas.convertRowIndexToModel(linha));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovaVaga;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrVagas;
    private javax.swing.JTable tblVagas;
    // End of variables declaration//GEN-END:variables
}
