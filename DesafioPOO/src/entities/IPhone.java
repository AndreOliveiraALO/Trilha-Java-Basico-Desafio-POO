package entities;

public class IPhone implements 
    ReprodutorMusical, 
    ReprodutorVideo, 
    AparelhoTelefonico, 
    NavegadorInternet {

    // Métodos da interface Midia
    @Override
    public void reproduzir(String nome) {
        System.out.println("Reproduzindo: " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Mídia pausada.");
    }

    @Override
    public void selecionar(String nome) {
        System.out.println("Selecionando: " + nome);
    }

    // Método específico do ReprodutorMusical
    @Override
    public void criarPlaylist(String nome) {
        System.out.println("Playlist '" + nome + "' criada.");
    }

    // Método específico do ReprodutorVideo
    @Override
    public void selecionarLegenda(String idioma) {
        System.out.println("Legenda selecionada: " + idioma);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba aberta com: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}
