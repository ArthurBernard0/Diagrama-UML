public abstract class iphone implements App.ReprodutorMusical, App.AparelhoTelefonico, App.NavegadorInternet {
        
    @Override
    public void tocar() {
        System.out.println("Tocanddo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica(String musica){
        System.err.println("Selecionando música " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.err.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaGuia() {
        System.out.println("Nova guia adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }
}

