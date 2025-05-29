package entities;

import model.exception.DomainException;

public class Account {

	private Integer number; //numero da conta
	private String holder; //titular
	private Double balance; //saldo
	private Double withdrawLimit; //saque
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	//lanca a exceção 
	//main vai trtar no try catch
	public void withdraw(Double amount) throws DomainException {
		if(amount > this.withdrawLimit)
			throw new DomainException("The amount exceeds withdraw limit.");
		if (this.balance < 0 || amount > this.balance)
			throw new DomainException("Not enought balance.");
		this.balance -= amount;
	}
}
