package entities;

public class Funcionario {

	public String name;
	public double grossSalary; //salario bruto
	public double tax; //imposto
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary (double percentage) {
		this.grossSalary += grossSalary * percentage/100;
	}
	
	public String toString() {
		return this.name
				+ ", $ "
				+ netSalary();
	}
	
}