package hacktober;

import java.util.Scanner;

public class D16OuncesToPounds {

	public static void main(String[] args) {
		D16OuncesToPounds task = new D16OuncesToPounds();
		task.toConvert();
	}

	void toConvert() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Ounces : ");
			int input = scan.nextInt();
			System.out.println("-> "+(input/16)+" pounds, "+(input%16)+" ounces");
		}
	}

}
