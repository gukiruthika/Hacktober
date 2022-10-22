package hacktober;

import java.util.Scanner;

public class D22FirstDifference {

	public static void main(String[] args) {
		D22FirstDifference task = new D22FirstDifference();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word 1 : ");
		String word1 = scan.nextLine();
		System.out.print("Enter a word 2 : ");
		String word2 = scan.nextLine();
		scan.close();
		System.out.println(checkDifference(word1,word2,0));
	}
	
	int checkDifference(String word1,String word2,int index) {
		if(word1.equals(word2))
			return -1;
		if(index==word1.length()|index==word2.length())
			return index;
		if(word1.charAt(index)!=word2.charAt(index))
			return index;
		return checkDifference(word1,word2,index+1);	
	}


}
