package hacktober;

import java.util.Scanner;

public class D27NumberPattern {

	public static void main(String[] args) {
		D27NumberPattern task = new D27NumberPattern();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		scan.close();
		printPattern(n - 1);
	}

	void printPattern(int n) {
		int[][] mat = new int[n][n];
		int value;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i == 0)
					mat[i][j] = (j + 1);
				else if (j == 0)
					mat[i][j] = (i + 1);
				else if (i == mat.length - 1)
					mat[i][j] = (mat[i][j - 1] - 1);
				else if (j == mat.length - 1)
					mat[i][j] = (mat[i - 1][j] - 1);
				else {
					value = mat[i][j-1]+(i+1);
					if(value<=n)
						mat[i][j] = value;
					else
						mat[i][j] = value-n-1;
				}

			}
		}
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
