package hacktober;

import java.util.Scanner;

public class D07LeapYear {

	public static void main(String[] args) {
		D07LeapYear task = new D07LeapYear();
		task.process();
	}

	void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = scan.nextInt();
		scan.close();
		System.out.println(isLeapYear(year));
	}

	boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 4 == 0 & year % 100 != 0)
			return true;
		return false;
	}

}
