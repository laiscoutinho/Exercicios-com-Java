package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// associados os objtos de departamento e worker
		System.out.print("Departament name: ");
		String departamentName = sc.nextLine();
		System.out.println("enter worker data: ");
		System.out.print("name: ");
		String workerName = sc.nextLine();
		System.out.print("level: ");
		String workerLevel = sc.nextLine();
		System.out.print("base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), 
									baseSalary, new Departament(departamentName));
		System.out.print("how many contracts have?  ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("enter contract "+i);
			System.out.print("date (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("value per hour: ");
			double valueHour = sc.nextDouble();
			System.out.print("duraction (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valueHour, hours);
			//associar meu contrato com meu trbalahdor
			//meus contratos vao estar na lista de contratos do meu trabalhador
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("enter month and year to calculate income (MM/yyyy): ");
		String monthYear = sc.next();
		//gera string com 2 digitos
		//integer porque transfroma para inteiro
		int month = Integer.parseInt(monthYear.substring(0, 2)); // 2 porque infomra 1 a mais
		int year = Integer.parseInt(monthYear.substring(3)); //pega do 3 em diante
		System.out.println("name: " + worker.getName());
		System.out.println("departament: " + worker.getDepartament().getName());
		System.out.printf("income for " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
