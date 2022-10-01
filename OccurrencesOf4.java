package Hacktober;

import java.util.Scanner;

public class OccurrencesOf4 {

	public static void main(String[] args) {
		OccurrencesOf4 task = new OccurrencesOf4();
		task.process();
	}
	void process() {
		try (Scanner scan = new Scanner(System.in)) {
//			System.out.println("Enter");
//			int number = scan.nextInt();
			System.out.println(getOccurrencesOf4(scan.nextInt()));
		}
	}
	int getOccurrencesOf4(int number) {
		int digit,count=0;
		while(number>0) {
			digit = number%10;
			if(digit==4)
				count++;
			number/=10;
		}
		return count;
	}

}
