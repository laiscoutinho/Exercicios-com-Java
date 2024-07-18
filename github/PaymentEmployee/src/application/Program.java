package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitites.Employee;
import entitites.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n ;i++) {
			//saber se eh terceirizado
			System.out.println("outsource (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("hours: ");
			int hour = sc.nextInt();
			System.out.print("value per hour: ");
			double valueHours = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee e = new OutsourceEmployee(name, hour, valueHours, additionalCharge);
				list.add(e);
			} else {
				//mesma coisa se criar variavel
				list.add(new Employee(name, hour, valueHours));
			}
		}
		
		System.out.println("PAYMENTS");
		for(Employee e : list) {
			System.out.println();
			System.out.printf(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		
		sc.close();
	}

}
