package br.com.agenciaempregos.main;

import br.com.agenciaempregos.forms.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {

    public static final String LOGIN = "login";
    public static final String CADASTRO_USUARIO = "cadastroUsuario";
    public static final String ESCOLHA_ACESSO = "escolhaAcesso";

    public static final String DASHBOARD_CANDIDATO = "dashboardCandidato";
    public static final String PERFIL_CANDIDATO = "perfilCandidato";
    public static final String BUSCAR_VAGAS = "buscarVagas";
    public static final String MINHAS_CANDIDATURAS = "minhasCandidaturas";
    public static final String PROCESSOS_CANDIDATO = "processosCandidato";

    public static final String DASHBOARD_EMPRESA = "dashboardEmpresa";
    public static final String PERFIL_EMPRESA = "perfilEmpresa";
    public static final String MINHAS_VAGAS = "minhasVagas";
    public static final String CADASTRO_VAGA = "cadastroVaga";
    public static final String CANDIDATURAS_EMPRESA = "candidaturasEmpresa";
    public static final String PROCESSOS_EMPRESA = "processosEmpresa";

    private final CardLayout cartas = new CardLayout();
    private final JPanel telas = new JPanel(cartas);

    public TelaPrincipal() {
        setTitle("Agência de Empregos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(900, 620));
        setSize(1000, 680);
        setLocationRelativeTo(null);

        telas.add(new LoginPanel(this), LOGIN);
        telas.add(new CadastroUsuarioPanel(this), CADASTRO_USUARIO);
        telas.add(new EscolhaAcessoPanel(this), ESCOLHA_ACESSO);

        telas.add(new DashboardCandidatoPanel(this), DASHBOARD_CANDIDATO);
        telas.add(new PerfilCandidatoPanel(this), PERFIL_CANDIDATO);
        telas.add(new BuscarVagasPanel(this), BUSCAR_VAGAS);
        telas.add(new MinhasCandidaturasPanel(this), MINHAS_CANDIDATURAS);
        telas.add(new ProcessosSeletivosCandidatoPanel(this), PROCESSOS_CANDIDATO);

        telas.add(new DashboardEmpresaPanel(this), DASHBOARD_EMPRESA);
        telas.add(new PerfilEmpresaPanel(this), PERFIL_EMPRESA);
        telas.add(new MinhasVagasPanel(this), MINHAS_VAGAS);
        telas.add(new CadastroVagaPanel(this), CADASTRO_VAGA);
        telas.add(new CandidaturasEmpresaPanel(this), CANDIDATURAS_EMPRESA);
        telas.add(new ProcessosSeletivosEmpresaPanel(this), PROCESSOS_EMPRESA);

        setContentPane(telas);
        mostrar(LOGIN);
    }

    public void mostrar(String nome) {
        cartas.show(telas, nome);
    }
}
