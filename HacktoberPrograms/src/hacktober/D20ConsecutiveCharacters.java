package hacktober;

import java.util.Scanner;

public class D20ConsecutiveCharacters {

	public static void main(String[] args) {
		D20ConsecutiveCharacters task = new D20ConsecutiveCharacters();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String input = scan.nextLine();
		scan.close();
		
		System.out.println(checkConsecutiveCharacters(input,1));
	}
	
	boolean checkConsecutiveCharacters(String str,int index) {
		if(index==str.length())
			return false;
		if(str.charAt(index)==str.charAt(index-1))
			return true;
		return checkConsecutiveCharacters(str,index+1);	
	}

}
