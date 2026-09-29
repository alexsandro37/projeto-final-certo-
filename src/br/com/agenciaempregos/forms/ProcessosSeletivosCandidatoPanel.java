package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.ProcessoSeletivoDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.ProcessoSeletivo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcessosSeletivosCandidatoPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;

    public ProcessosSeletivosCandidatoPanel(TelaPrincipal tela) {
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
        scrProcessos = new javax.swing.JScrollPane();
        tblProcessos = new javax.swing.JTable();

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
        pnlConteudo.setLayout(new java.awt.BorderLayout());
        tblProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaga", "Empresa", "Situação", "Observação"
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
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_CANDIDATO);
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void carregar() {
        if (Sessao.candidato == null) {
            return;
        }
        try {
            List<Object[]> linhas = new ArrayList<>();
            for (ProcessoSeletivo p : new ProcessoSeletivoDAO().listarPorCandidato(Sessao.candidato.getId())) {
                linhas.add(new Object[]{p.getVagaTitulo(), p.getEmpresaNome(), p.getSituacao(), Util.texto(p.getObservacao())});
            }
            Util.preencher(tblProcessos, linhas);
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrProcessos;
    private javax.swing.JTable tblProcessos;
    // End of variables declaration//GEN-END:variables
}
