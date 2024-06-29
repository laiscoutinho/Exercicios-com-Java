package entities;

public class Bank {

	private int numberCount;
	private String name;
	private double sald;
	
	public Bank(int numberCount, String name, double depositeInitial) {
		this.numberCount = numberCount;
		this.name = name;
		deposit(depositeInitial);  //encapsulamento
	}
	public Bank(int numberCount, String name) {
		this.numberCount = numberCount;
		this.name = name;
	}

	public int getNumberCount() {
		return numberCount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSald() {
		return sald;
	}
	public void deposit(double sald) {
		this.sald += sald;
	}
	public void saque(double sald) {
		this.sald -= sald + 5;
	}
	
	public String toString() {
		return "Account " 
				+ numberCount 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ sald;
	}
}