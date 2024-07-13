package model.exception;

public class DomainException extends Exception{

	// versao
	private static final long serialVersionUID = 1L;

	//construtor
	//repoassar p construtor da super classe
	//poder instanciar passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
}
