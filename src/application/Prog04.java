package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Prog04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.setName(sc.nextLine());
		
		System.out.print("Grade 1: ");
		student.setGrade1(sc.nextDouble());
		
		System.out.print("Grade 2: ");
		student.setGrade2(sc.nextDouble());
		
		System.out.print("Grade 3: ");
		student.setGrade3(sc.nextDouble());
		
		student.approvedOrNot();
	
		sc.close();
	}
}
