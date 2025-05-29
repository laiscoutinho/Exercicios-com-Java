package entities;

import interfaces.AparelhoEletronico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone extends Smarthphone implements ReprodutorMusical, AparelhoEletronico, NavegadorInternet{

	public Iphone(String modelo, String numero) {
        super(modelo, numero);
    }
	
	@Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Métodos de IAparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Realizando chamada...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos de INavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void adicionarAosFavoritos() {
        System.out.println("Adicionando página aos favoritos...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

}
