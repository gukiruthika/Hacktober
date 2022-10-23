package hacktober;

import java.util.Scanner;

public class D23BinaryCheck {

	public static void main(String[] args) {
		D23BinaryCheck task = new D23BinaryCheck();
		task.display();
	}

	void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scan.nextLine();
		scan.close();
		System.out.println(checkBinary(str, 0));
	}

	boolean checkBinary(String str,int index) {
		if(index==str.length())
			return true;
		if(str.charAt(index)!='0'&str.charAt(index)!='1')
			return false;
		return checkBinary(str,index+1);	
	}

}
