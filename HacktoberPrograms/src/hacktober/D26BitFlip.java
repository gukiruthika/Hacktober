package hacktober;

import java.util.Scanner;

public class D26BitFlip {

	public static void main(String[] args) {
		D26BitFlip task = new D26BitFlip();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a binary string : ");
		String word = scan.nextLine();
		char[] str = word.toCharArray();
		scan.close();
		System.out.println(flipBit(str,0));
	}
	
	String flipBit(char[] str,int index) {
		if(index==str.length)
			return String.valueOf(str);
		str[index]=str[index]=='1'?'0':'1';
		return flipBit(str,index+1);	
	}

}
