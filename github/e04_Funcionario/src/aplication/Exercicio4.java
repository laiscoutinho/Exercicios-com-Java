package aplication;

import java.util.Scanner;

import entities.Funcionario;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		func.netSalary();
		System.out.println("Funcionario: " + func.toString());
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		System.out.println("Updated data: " + func.toString());
		
		sc.close();
	}

}
