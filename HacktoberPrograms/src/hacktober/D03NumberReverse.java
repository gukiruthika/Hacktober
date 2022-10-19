package hacktober;

import java.util.Scanner;

public class D03NumberReverse {

	public static void main(String[] args) {
		D03NumberReverse task = new D03NumberReverse();
		task.toReverse();
	}

	void toReverse() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		scan.close();
		int reverse=0,remainder;
		while(number>0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number/=10;
		}
		System.out.println("-> " + reverse);
	}
}
