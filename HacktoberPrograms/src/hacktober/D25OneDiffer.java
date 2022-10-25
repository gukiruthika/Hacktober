package hacktober;

import java.util.Scanner;

public class D25OneDiffer {
	public static void main(String[] args) {
		D25OneDiffer task = new D25OneDiffer();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word 1 : ");
		String word1 = scan.nextLine();
		System.out.print("Enter a word 2 : ");
		String word2 = scan.nextLine();
		scan.close();
		System.out.println(oneAway(word1,word2,0,0));
	}
	
	boolean oneAway(String word1,String word2,int index,int count) {
		if(!(word1.length()==word2.length())|count>1)
			return false;
		if(index==word1.length())
			return true;
		if(word1.charAt(index)!=word2.charAt(index))
			count++;
		return oneAway(word1,word2,index+1,count);	
	}
}
