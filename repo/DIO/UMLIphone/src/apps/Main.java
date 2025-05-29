package apps;

import entities.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone("iPhone 13", "123456789");

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();

        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina();
        meuIphone.adicionarAosFavoritos();
        meuIphone.atualizarPagina();
	}

}
