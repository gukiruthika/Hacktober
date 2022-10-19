package hacktober;

import java.util.Scanner;

public class D17PrintChessBoard {

	public static void main(String[] args) {
		D17PrintChessBoard task = new D17PrintChessBoard();
		task.process();
	}

	void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int size = scan.nextInt();
		scan.close();
		printChessBoard(size);

	}

	void printChessBoard(int size) {
		int x = 1;
		for (int i = 0; i < size; i++) {
			if (size % 2 == 0 && i != 0) {
				x = x == 1 ? 2 : 1;
			}
			for (int j = 0; j < size; j++) {
				System.out.print(x);
				x = x == 1 ? 2 : 1;
			}
			System.out.println();
		}
	}
}
