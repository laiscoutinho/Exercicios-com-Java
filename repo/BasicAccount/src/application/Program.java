package application;

import java.util.Scanner;

import entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("number: ");
			int number = sc.nextInt();
			System.out.print("holder: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("initial balance: ");
			double balanceInitial = sc.nextDouble();
			System.out.print("withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account acc = new Account(number, name, balanceInitial, withdrawLimit);
			
			System.out.println();
			System.out.print("enter amount for withdraw: ");
			acc.withdraw(sc.nextDouble());
			System.out.print("New balance: " + acc.getBalance());
		}
		catch(DomainException e){
			System.out.println("Withdraw error: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Operation Invalid");
		}
		
		
		sc.close();
	}

}
