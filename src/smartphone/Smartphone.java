package smartphone;

import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.navegadorInternet.NavegadorInternet;
import funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio devoz.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
    
}
