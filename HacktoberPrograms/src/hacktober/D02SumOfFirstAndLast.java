package hacktober;

import java.util.Scanner;

public class D02SumOfFirstAndLast {

	public static void main(String[] args) {
		D02SumOfFirstAndLast task = new D02SumOfFirstAndLast();
		System.out.println(task.addTwo());
	}

	int addTwo() {
		try (Scanner scan = new Scanner(System.in)) {
			int number = scan.nextInt();
			int last = number % 10;
			int first = 0;
			while (number > 0) {
				first = number;
				number /= 10;
			}
			return first + last;
		}
	}
}
