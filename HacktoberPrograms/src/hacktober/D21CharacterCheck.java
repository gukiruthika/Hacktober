package hacktober;

import java.util.Scanner;

public class D21CharacterCheck {

	public static void main(String[] args) {
		D21CharacterCheck task = new D21CharacterCheck();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String word = scan.nextLine();
		System.out.print("Enter a character : ");
		char letter = scan.nextLine().charAt(0);
		scan.close();
		
		System.out.println(checkCharacter(word,0,letter));
	}
	
	boolean checkCharacter(String word,int index,char letter) {
		if(index==word.length())
			return false;
		if(word.charAt(index)==letter)
			return true;
		return checkCharacter(word,index+1,letter);	
	}

}
