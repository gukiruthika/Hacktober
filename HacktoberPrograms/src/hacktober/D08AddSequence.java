package hacktober;

import java.util.Scanner;

public class D08AddSequence {

	public static void main(String[] args) {
		D08AddSequence task = new D08AddSequence();
		task.process();
	}

	void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sequence : ");
		String sequence = scan.nextLine();
		scan.close();
		System.out.println("Sum -> "+getSum(sequence));
	}

	int getSum(String sequence) {
		String[] numbers = sequence.split(";");
		int sum=0;
		for(String number:numbers) {
			sum+=Integer.valueOf(number);
		}
		return sum;
	}

}
