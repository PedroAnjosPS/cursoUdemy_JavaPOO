package entities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	// Constructors
	public Employee() {
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double increasePercentage) {
		double increasedSalary = this.getSalary() * ((increasePercentage / 100.0) + 1.0); 
		
		this.setSalary(increasedSalary);
	}
	
	public String toString() {
		return this.getId() + ", " + this.getName() + ", $" + String.format("%.2f", this.getSalary());
	}
	
}
