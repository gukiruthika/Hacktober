package hacktober;

import java.util.Random;
import java.util.Scanner;

public class D31Minesweeper {

	public static void main(String[] args) {
		D31Minesweeper task = new D31Minesweeper();
		task.process();
	}

	private void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row");
		int row = scan.nextInt();
		System.out.println("Enter column");
		int column = scan.nextInt();
		scan.close();
		printMinesweeper(row, column);
	}

	private void printMinesweeper(int row, int column) {
		char[][] minesweeper = new char[row][column];
		Random random = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				minesweeper[i][j] = random.nextInt(2) == 0 ? '0' : 'M';
				System.out.print(minesweeper[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(minesweeper[i][j]!='M')
				minesweeper[i][j] = getMineCount(minesweeper, i, j, row, column);
				System.out.print(minesweeper[i][j] + " ");
			}
			System.out.println();
		}
	}

	private char getMineCount(char[][] minesweeper, int row, int column, int rows, int columns) {
		int count = 0;

		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if (row + i >= 0 & row + i < rows & column + j >= 0 & column + j < columns) {
					if (minesweeper[row + i][column + j] == 'M')
						count++;
				}
			}
		}
		return (char) (count + '0');
	}

}
