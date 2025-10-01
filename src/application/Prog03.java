package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Prog03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee;
		employee = new Employee();
		
		System.out.print("Name: ");
		employee.setName(sc.nextLine());
		
		System.out.print("Gross salary: ");
		employee.setGrossSalary(sc.nextDouble());
		
		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.printf("%nEmployee: %s, $ %.2f%n%n", employee.getName(), 
				employee.getGrossSalary());
		
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("\nUpdate data: " + employee);

		sc.close();
	}

}
