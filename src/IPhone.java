public class IPhone implements INavegadorInternet, IAparelhoTelefonico, IReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Reprodutor Musical - Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor Musical - Pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Reprodutor Musical - Selecionar Música");
    }

    @Override
    public void ligar() {
        System.out.println("Aparelho Telefônico - ligar");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho Telefônico - atender");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Aparelho Telefônico - iniciar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Navegar Internet - exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegar Internet - adicionar nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador Internet - atualizar página!");
    }
    
}
