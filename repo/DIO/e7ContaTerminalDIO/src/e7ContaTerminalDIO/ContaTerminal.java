package e7ContaTerminalDIO;

import java.util.Scanner;

public class ContaTerminal {

	public int numero = 0;
    public String agencia = null, nomeCliente = null;
    public float saldo = 0f;
    
	public static void main(String[] args) {
		
		Scanner sc = null;
		ContaTerminal ct = new ContaTerminal();
		
        try {
        	sc = new Scanner(System.in);
    		System.out.println("--------Seja Bem-Vindo ao Banco!--------");
            System.out.println("Digite seu nome: ");
        	ct.nomeCliente = sc.nextLine();
        	System.out.println("Ola " + ct.nomeCliente + ", agora digite a agencia: ");
            ct.agencia = sc.nextLine();
            System.out.println("Certo. Agora digite o *numero* da agencia: ");
            ct.numero = sc.nextInt();
            System.out.println("Agora seu saldo correspondente: ");
            ct.saldo = sc.nextFloat();
            
            System.out.println("----------------------------------------");
            System.out.println("Olá " + ct.nomeCliente + 
            					", obrigado por criar uma conta em nosso banco, " +
            					"sua agência é " + ct.agencia + 
            					", conta " +  ct.numero + 
            					" e seu saldo " + ct.saldo +
            					" já está disponível para saque!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) sc.close();
		}
        
	}

}
