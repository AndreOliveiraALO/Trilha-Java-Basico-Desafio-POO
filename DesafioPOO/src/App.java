import entities.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        // Reprodutor Musical
        iphone.criarPlaylist("Favoritas");
        iphone.selecionar("Luiz Gonzaga");
        iphone.reproduzir("O Cheiro Da Carolina");
        iphone.pausar();

        // Reprodutor de Vídeo
        iphone.selecionar("Gladiador");
        iphone.reproduzir("Gladiador");
        iphone.selecionarLegenda("Português");        

        // Navegador
        iphone.exibirPagina("https://www.santander.com.br/");
        iphone.adicionarNovaAba("https://dio.me");
        iphone.atualizarPagina();

        // Aparelho Telefônico
        iphone.ligar("11999998888");
        iphone.atender();
        iphone.iniciarCorreioVoz();    
    }
}
