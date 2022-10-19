package hacktober;

import java.util.Scanner;

public class D06CapitalizeFirstLetter {

	public static void main(String[] args) {
		D06CapitalizeFirstLetter task = new D06CapitalizeFirstLetter();
		task.process();
	}
	void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentance : ");
		String input = scan.nextLine();
		scan.close();
		String newString="";
		String[] words = input.split(" ");
		for(String word:words) {
			char firstLetter = word.charAt(0);
			firstLetter +=('A'-'a');
			word = firstLetter+word.substring(1)+" ";
			newString+=word;
		}
		System.out.println(newString);
	}

}
