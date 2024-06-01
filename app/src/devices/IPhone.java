package devices;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public IPhone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

}
