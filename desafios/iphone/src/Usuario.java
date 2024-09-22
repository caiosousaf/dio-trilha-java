public class Usuario {
    public static void main(String[] args) {
        Iphone caio = new Iphone();

        caio.ligar("88888888888");
        caio.atender();
        caio.iniciarCorreioVoz();

        caio.adicionarNovaAba();
        caio.atualizarPagina();
        caio.exibirPagina("www.carryonme.com");

        caio.selecionarMusica("Carry on me");
        caio.tocar();
        caio.pausar();
    }
}