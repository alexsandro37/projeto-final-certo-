package br.com.agenciaempregos.model;

public class ProcessoSeletivo {

    private int id;
    private int candidaturaId;
    private String situacao;
    private String observacao;
    private String candidatoNome;
    private String vagaTitulo;
    private String empresaNome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandidaturaId() {
        return candidaturaId;
    }

    public void setCandidaturaId(int candidaturaId) {
        this.candidaturaId = candidaturaId;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCandidatoNome() {
        return candidatoNome;
    }

    public void setCandidatoNome(String candidatoNome) {
        this.candidatoNome = candidatoNome;
    }

    public String getVagaTitulo() {
        return vagaTitulo;
    }

    public void setVagaTitulo(String vagaTitulo) {
        this.vagaTitulo = vagaTitulo;
    }

    public String getEmpresaNome() {
        return empresaNome;
    }

    public void setEmpresaNome(String empresaNome) {
        this.empresaNome = empresaNome;
    }
}
