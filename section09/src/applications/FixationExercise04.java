package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;


public class FixationExercise04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
				
		final int TOT_ROOMS = 10;
		 
		String name, email;
		int numRoomsRented = 0, room = 0;
		Rent[] rents = new Rent[TOT_ROOMS];
		
		System.out.print("How many rooms will be rented? ");
		numRoomsRented = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= numRoomsRented; i++) {
			sc.nextLine();
			
			System.out.printf("Rent #%d: %n", i);
			
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Email: ");
			email = sc.nextLine();
			
			System.out.print("Room: ");
			room = sc.nextInt();
			
			rents[room] = new Rent(name, email, room);
			
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < TOT_ROOMS; i++) {
			if(rents[i] != null)
				System.out.println(rents[i]);
		}
		
		
		sc.close();
	}

}
