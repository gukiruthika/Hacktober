package hacktober;

import java.util.Scanner;

public class D09WordValue {

	public static void main(String[] args) {
		D09WordValue task = new D09WordValue();
		task.displayValue();
	}

	void displayValue() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String input = scan.nextLine();
		scan.close();
		int value=0;
		for(int i=0;i<input.length();i++) {
			value+=(input.charAt(i)-'a');
		}
		System.out.println(value+input.length());
	}

}
