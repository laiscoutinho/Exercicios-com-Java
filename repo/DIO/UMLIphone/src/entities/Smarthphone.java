package entities;

public abstract class Smarthphone {
	
	protected String modelo;
    protected String numero;
    
    public Smarthphone (String modelo, String numero) {
        this.modelo = modelo;
        this.numero = numero;
    }

}
