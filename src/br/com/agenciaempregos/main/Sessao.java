package br.com.agenciaempregos.main;

import br.com.agenciaempregos.model.Candidato;
import br.com.agenciaempregos.model.Empresa;
import br.com.agenciaempregos.model.Usuario;
import br.com.agenciaempregos.model.Vaga;

public class Sessao {

    public static Usuario usuario;
    public static Candidato candidato;
    public static Empresa empresa;
    public static Vaga vagaEmEdicao;

    public static void limpar() {
        usuario = null;
        candidato = null;
        empresa = null;
        vagaEmEdicao = null;
    }
}
