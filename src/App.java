public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        //reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        //aparelho telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        //navegador internet
        iphone.exibirPagina();  
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}



// Repodutor Musicial: tocar, pausar, selecionarMusica
// Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
// Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina