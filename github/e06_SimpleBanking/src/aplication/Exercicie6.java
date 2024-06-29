package aplication;

import java.util.Scanner;

import entities.Bank;

public class Exercicie6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank b;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine(); //buffer
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		if(option == 'n') {
			b = new Bank(number, name);
		} else {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			b = new Bank(number, name, value);
		}
		
		System.out.println("Account data:");
		System.out.println(b);
		System.out.println("Enter a deposit value:");
		double value = sc.nextDouble();
		b.deposit(value);
		System.out.println("Updated account data:");
		System.out.println(b);
		System.out.println("Enter a withdraw value:");
		value = sc.nextDouble();
		b.saque(value);
		System.out.println("Updated account data:");
		System.out.println(b); 
		
		sc.close();
	}

}
