package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament;
	//tem varios -> lista
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker () {
	}
	
	//nao poe atributos que nao sejam lista
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//azer ou desfazer a associção do trabalhador ao contrato
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	//calcula qunto pessoa ganhou no mes
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		// soma o salario base mais os valores dos contratos naquwle mes
		// para cada contrato c na lista de contratos
		for (HourContract c : contracts) {
			//pego a data do meu contrato e definir como sendo a data do meu calendario
			cal.setTime(c.getDate()); 
			int c_year = cal.get(Calendar.YEAR);
			int c_month =  1 + cal.get(Calendar.MONTH); // acrescenta 1 pq o calendar cmc do 0
			//se a data pedida e a data do calendario bater ai eu faço a soma
			if (year == c_year && month == c_month)
				sum += c.totalValue();
		}
		return sum;
	}
	
}
