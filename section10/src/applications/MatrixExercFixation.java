package applications;

import java.util.Scanner;

public class MatrixExercFixation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int rows = sc.nextInt();

		System.out.print("Enter the number of columns: ");
		int columns = sc.nextInt();

		int[][] matrix = new int[rows][columns];

		System.out.println("\nEnter the numbers into this matrix: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nEnter a number that contained in the matrix: ");
		int x = sc.nextInt();
		boolean xExists = false;

		for (int[] row : matrix) {
			for (int number : row) {
				if (number == x) {
					xExists = true;
					break;
				}
			}

			if (xExists)
				break;
		}

		if (!xExists) {
			System.out.println("The number that you typed doesn't exist in the matrix!");
		} else {
			int rowPos = 0, columnPos = 0, left = 0, right = 0, up = 0, down = 0;

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] == x) {
						rowPos = i;
						columnPos = j;
						left = (j > 0) ? matrix[i][j - 1] : -1;
						right = (j < matrix[i].length - 1) ? matrix[i][j + 1] : -1;
						up = (i > 0) ? matrix[i - 1][j] : -1;
						down = (i < matrix.length - 1) ? matrix[i + 1][j] : -1;

						System.out.printf("Position %d,%d: %n", rowPos, columnPos);
						if (left >= 0)
							System.out.println("Left: " + left);
						if (right >= 0)
							System.out.println("Right: " + right);
						if (up >= 0)
							System.out.println("Up: " + up);
						if (down >= 0)
							System.out.println("Down: " + down);
						
						System.out.println();
					}
				}
			}
		}

		sc.close();
	}

}
