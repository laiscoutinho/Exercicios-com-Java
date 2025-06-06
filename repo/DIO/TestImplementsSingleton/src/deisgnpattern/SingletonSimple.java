package deisgnpattern;

public class SingletonSimple {

	private static SingletonSimple instancia;
	
	// Deixar o contrutor privado apra qwue ninguem consiga isnatnciar ele alem dele mesmo
	private SingletonSimple () {
		super ();
	}
	
	public static SingletonSimple getInstancia() {
		if (instancia == null) instancia = new SingletonSimple();
		return instancia;
	}
}
