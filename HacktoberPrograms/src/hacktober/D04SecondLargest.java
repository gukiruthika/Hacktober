package hacktober;

import java.util.Scanner;

public class D04SecondLargest {

	public static void main(String[] args) {
		D04SecondLargest task = new D04SecondLargest();
		System.out.print("\nSecond Largest number -> "+task.toReverse());
	}

	int toReverse() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int number1 = scan.nextInt();
		System.out.print("Enter number 2 : ");
		int number2 = scan.nextInt();
		System.out.print("Enter number 3 : ");
		int number3 = scan.nextInt();
		scan.close();
		if((number1<number2&number1>number3)||(number1<number3&number1>number2))
			return number1;
		else if((number2<number1&number2>number3)||(number2<number3&number2>number1))
			return number2;
		return number3;
	}
}
