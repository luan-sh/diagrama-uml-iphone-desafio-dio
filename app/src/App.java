import apps.IPod;
import apps.Safari;
import apps.Phone;
import devices.IPhone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class App {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new IPod();
        AparelhoTelefonico telefone = new Phone();
        NavegadorInternet navegador = new Safari();

        IPhone iPhone = new IPhone(reprodutor, telefone, navegador);

        iPhone.getReprodutor().selecionarMusica("When The Smoke Is Going Down");
        iPhone.getReprodutor().tocar();
        iPhone.getReprodutor().pausar();

        iPhone.getTelefone().iniciarCorreioVoz();
        iPhone.getTelefone().atender();
        iPhone.getTelefone().ligar("123456789");

        iPhone.getNavegador().exibirPagina("www.google.com");
        iPhone.getNavegador().atualizarPagina();
        iPhone.getNavegador().adicionarNovaAba();
    }
}
