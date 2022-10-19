package hacktober;

import java.util.Scanner;

public class D12Palindrome {

	public static void main(String[] args) {
		D12Palindrome task = new D12Palindrome();
		System.out.println(task.display());
	}

	String display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String input = scan.nextLine();
		scan.close();
		StringBuilder word = new StringBuilder(input);
		StringBuilder reverse = new StringBuilder(input);
		reverse.reverse();
		if ((word.toString()).equals(reverse.toString()))
			return "true";
		else
			return "false";
	}

}
