package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class FixationExercise01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
				
		StringBuilder people16Years = new StringBuilder();
		
		String name;
		int numPeople = 0, age, countAge16 = 0;
		double height, sumHeight = 0;
		
		System.out.print("How many people will be registered? ");
		numPeople = sc.nextInt();
		
		Person[] person = new Person[numPeople];
		
		System.out.println();
		
		for(int i = 0; i < numPeople; i++) {
			
			sc.nextLine();
			
			System.out.printf("Enter the %d person's details: ", (i+1));
			
			System.out.print("\nName: ");
			name = sc.nextLine();
			
			System.out.print("Age: ");
			age = sc.nextInt();
			
			if(age < 16) {
				people16Years.append(name).append("\n");
				countAge16++;
			}
				
			
			System.out.print("Height: ");
			height = sc.nextDouble();
			
			sumHeight += height;
			
			person[i] = new Person(name, age, height);
			
			System.out.println();
		}
		
		double avgHeight = sumHeight / numPeople;
		
		double age16Percent = (double) countAge16 / numPeople;
		
		System.out.printf("Average height: %.2f%n", avgHeight);
		System.out.printf("People under 16 years of age: %.2f%%%n", age16Percent * 100);
		System.out.printf("%s", people16Years);
		
		
		sc.close();
	}

}
