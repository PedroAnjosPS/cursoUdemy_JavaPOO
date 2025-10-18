package applications;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import entities.Employee;

public class FixationExercise01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		int numEmployees = 0, id = 0;
		String name = "";
		double salary = 0.0;
		
		System.out.print("How many employees will be registered? ");
		numEmployees = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < numEmployees; i++) {
			System.out.printf("Employee #%d: %n", (i + 1));
			
			System.out.print("Id: ");
			id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			employees.add(emp);
			
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idToIncrease = sc.nextInt();
		
		Employee empl = employees.stream()
				.filter(emp -> emp.getId() == idToIncrease)
				.findFirst()
				.orElse(null);
		
		if(empl == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double increasePercentage = sc.nextDouble();
			
			empl.increaseSalary(increasePercentage);
		}
		
		System.out.println("\nList of employees:");
		
		for(Employee e : employees) {
			System.out.println(e.toString());
		}
					
		
		sc.close();
	}

}
