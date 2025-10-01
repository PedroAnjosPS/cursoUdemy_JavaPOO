package entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrossSalary() {
		return this.grossSalary;
	}
	
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		double netSalary;
		netSalary = this.getGrossSalary() - this.getTax();
		return netSalary;
	}
	
	public void increaseSalary(double percentage) {
		double increase;
		increase = this.getGrossSalary() * (percentage / 100);
		this.setGrossSalary(this.getGrossSalary() + increase);
	}
	
	public String toString() {
		return this.getName() 
				+ ", $ "
				+ String.format("%.2f", this.netSalary());
	}
}
