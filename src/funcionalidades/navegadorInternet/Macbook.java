package funcionalidades.navegadorInternet;

public class Macbook implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atuallizando Página.");
    }
    
}
