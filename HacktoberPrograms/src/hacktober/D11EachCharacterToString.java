package hacktober;

import java.util.Scanner;

public class D11EachCharacterToString {

	public static void main(String[] args) {
		D11EachCharacterToString task = new D11EachCharacterToString();
		task.display();
	}
	void display() {
		try (Scanner scan = new Scanner(System.in)) {
			String input = scan.nextLine();
			String temp="";
			for(int i=0;i<input.length();i++) {
				temp += input.charAt(i);
				System.out.print(temp+" ");
			}
		}
	}

}
