package hacktober;

import java.util.Scanner;

public class D24DigitalRoot {

	public static void main(String[] args) {
		D24DigitalRoot task = new D24DigitalRoot();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		scan.close();
		System.out.println("Digital root-> " + findDigitalRoot(number));
	}

	int findDigitalRoot(int number) {
		if (String.valueOf(number).matches("[1-9]"))
			return number;
		return findDigitalRoot(findSumOfDigits(number, 0));
	}

	int findSumOfDigits(int number, int sum) {
		if (number == 0)
			return sum;
		return findSumOfDigits(number / 10, sum + (number % 10));
	}
}
