
public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioDeVoz();
    }

    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaGuia();
        void atualizarPagina();
    }

}  