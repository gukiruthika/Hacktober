package hacktober;

import java.util.Scanner;

public class D10String {

	public static void main(String[] args) {
		D10String task = new D10String();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String input = scan.nextLine();
		scan.close();
		String temp = "";
		int k = (input.length() / 2) + 1;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++)
				temp += input.charAt(i);
			if (i < (input.length() / 2))
				k--;
			else
				k++;
		}
		System.out.print(temp);
	}

}
