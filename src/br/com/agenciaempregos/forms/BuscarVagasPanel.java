package br.com.agenciaempregos.forms;

import br.com.agenciaempregos.main.TelaPrincipal;
import br.com.agenciaempregos.dao.CandidaturaDAO;
import br.com.agenciaempregos.dao.VagaDAO;
import br.com.agenciaempregos.main.Sessao;
import br.com.agenciaempregos.main.Util;
import br.com.agenciaempregos.model.Candidatura;
import br.com.agenciaempregos.model.Vaga;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarVagasPanel extends javax.swing.JPanel {

    private final TelaPrincipal tela;
    private List<Vaga> vagas = new ArrayList<>();

    public BuscarVagasPanel(TelaPrincipal tela) {
        this.tela = tela;
        initComponents();
        txaDescricao.setEditable(false);
        tblVagas.getSelectionModel().addListSelectionListener(e -> {
            int linha = tblVagas.getSelectedRow();
            txaDescricao.setText(linha < 0 ? "" : Util.texto(vagas.get(tblVagas.convertRowIndexToModel(linha)).getDescricao()));
            txaDescricao.setCaretPosition(0);
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
        pnlFiltro = new javax.swing.JPanel();
        lblArea = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        pnlLista = new javax.swing.JPanel();
        scrVagas = new javax.swing.JScrollPane();
        tblVagas = new javax.swing.JTable();
        pnlDetalhe = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        scrDescricao = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        pnlBotoes = new javax.swing.JPanel();
        btnCandidatar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        pnlCabecalho.setBackground(new java.awt.Color(31, 78, 121));
        pnlCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 25, 15, 25));
        pnlCabecalho.setLayout(new java.awt.BorderLayout());
        lblTitulo.setText("Buscar vagas");
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
        pnlFiltro.setBackground(new java.awt.Color(244, 246, 248));
        pnlFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));
        lblArea.setText("Área:");
        lblArea.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblArea.setForeground(new java.awt.Color(33, 37, 41));
        pnlFiltro.add(lblArea);
        cmbArea.setFont(new java.awt.Font("Tahoma", 0, 14));
        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas as áreas", "Tecnologia", "Saúde", "Educação", "Administração", "Vendas", "Engenharia", "Marketing", "Financeiro" }));
        pnlFiltro.add(cmbArea);
        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnBuscar.setBackground(new java.awt.Color(46, 134, 222));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setOpaque(true);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setPreferredSize(new java.awt.Dimension(110, 32));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlFiltro.add(btnBuscar);
        pnlConteudo.add(pnlFiltro, java.awt.BorderLayout.NORTH);
        pnlLista.setBackground(new java.awt.Color(244, 246, 248));
        pnlLista.setLayout(new java.awt.BorderLayout(0, 10));
        tblVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaga", "Empresa", "Área"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVagas.setRowHeight(26);
        tblVagas.setFillsViewportHeight(true);
        scrVagas.setViewportView(tblVagas);
        pnlLista.add(scrVagas, java.awt.BorderLayout.CENTER);
        pnlDetalhe.setBackground(new java.awt.Color(244, 246, 248));
        pnlDetalhe.setLayout(new java.awt.BorderLayout(0, 5));
        lblDescricao.setText("Descrição da vaga");
        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblDescricao.setForeground(new java.awt.Color(33, 37, 41));
        pnlDetalhe.add(lblDescricao, java.awt.BorderLayout.NORTH);
        txaDescricao.setColumns(20);
        txaDescricao.setRows(4);
        txaDescricao.setLineWrap(true);
        txaDescricao.setWrapStyleWord(true);
        txaDescricao.setEditable(false);
        txaDescricao.setFont(new java.awt.Font("Tahoma", 0, 14));
        scrDescricao.setViewportView(txaDescricao);
        pnlDetalhe.add(scrDescricao, java.awt.BorderLayout.CENTER);
        pnlLista.add(pnlDetalhe, java.awt.BorderLayout.SOUTH);
        pnlConteudo.add(pnlLista, java.awt.BorderLayout.CENTER);
        pnlBotoes.setBackground(new java.awt.Color(244, 246, 248));
        pnlBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        btnCandidatar.setText("Candidatar-se");
        btnCandidatar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnCandidatar.setBackground(new java.awt.Color(46, 134, 222));
        btnCandidatar.setForeground(new java.awt.Color(255, 255, 255));
        btnCandidatar.setOpaque(true);
        btnCandidatar.setBorderPainted(false);
        btnCandidatar.setFocusPainted(false);
        btnCandidatar.setPreferredSize(new java.awt.Dimension(160, 36));
        btnCandidatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCandidatar);
        pnlConteudo.add(pnlBotoes, java.awt.BorderLayout.SOUTH);
        add(pnlConteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        tela.mostrar(TelaPrincipal.DASHBOARD_CANDIDATO);
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCandidatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatarActionPerformed
        int linha = tblVagas.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma vaga na tabela.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Vaga vaga = vagas.get(tblVagas.convertRowIndexToModel(linha));
        Candidatura candidatura = new Candidatura();
        candidatura.setCandidatoId(Sessao.candidato.getId());
        candidatura.setVagaId(vaga.getId());
        try {
            new CandidaturaDAO().inserir(candidatura);
            JOptionPane.showMessageDialog(this, "Candidatura realizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            if (Util.duplicado(e)) {
                JOptionPane.showMessageDialog(this, "Você já se candidatou a esta vaga.", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                Util.erro(this, e);
            }
        }
    }//GEN-LAST:event_btnCandidatarActionPerformed

    private void carregar() {
        cmbArea.setSelectedIndex(0);
        buscar();
    }

    private void buscar() {
        String area = (String) cmbArea.getSelectedItem();
        try {
            VagaDAO dao = new VagaDAO();
            vagas = cmbArea.getSelectedIndex() == 0 ? dao.listar() : dao.buscarPorArea(area);
            List<Object[]> linhas = new ArrayList<>();
            for (Vaga v : vagas) {
                linhas.add(new Object[]{v.getTitulo(), v.getEmpresaNome(), v.getArea()});
            }
            Util.preencher(tblVagas, linhas);
            txaDescricao.setText("");
        } catch (SQLException e) {
            Util.erro(this, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCandidatar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlDetalhe;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JScrollPane scrDescricao;
    private javax.swing.JScrollPane scrVagas;
    private javax.swing.JTable tblVagas;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
}
