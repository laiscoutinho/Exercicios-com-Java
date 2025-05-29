package apps;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente laiscoutinho = new Cliente();
		laiscoutinho.setNome("laiscoutinho");
		
		Conta cc = new ContaCorrente(laiscoutinho);
		Conta poupanca = new ContaPoupanca(laiscoutinho);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
