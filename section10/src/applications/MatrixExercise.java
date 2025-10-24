package applications;

import java.util.Scanner;

public class MatrixExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the matrix order: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		System.out.println("Type the matrix numbers: ");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMain diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) 
					count++;
			}
		}
		
		System.out.println("Negative numbers = " + count);

		sc.close();
	}

}
