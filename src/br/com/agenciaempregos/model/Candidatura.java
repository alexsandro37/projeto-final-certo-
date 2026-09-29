package br.com.agenciaempregos.model;

public class Candidatura {

    private int id;
    private int candidatoId;
    private int vagaId;
    private String dataCandidatura;
    private String status;
    private String candidatoNome;
    private String vagaTitulo;
    private String empresaNome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(int candidatoId) {
        this.candidatoId = candidatoId;
    }

    public int getVagaId() {
        return vagaId;
    }

    public void setVagaId(int vagaId) {
        this.vagaId = vagaId;
    }

    public String getDataCandidatura() {
        return dataCandidatura;
    }

    public void setDataCandidatura(String dataCandidatura) {
        this.dataCandidatura = dataCandidatura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
