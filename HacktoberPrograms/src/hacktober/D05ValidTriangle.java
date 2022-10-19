package hacktober;

import java.util.Scanner;

public class D05ValidTriangle {

	public static void main(String[] args) {
		D05ValidTriangle task = new D05ValidTriangle();
		System.out.println(task.validateTriangle());
	}

	String validateTriangle() {
		System.out.println("Enter the angles of triangle..");
		Scanner scan = new Scanner(System.in);
		int angle1 = scan.nextInt();
		int angle2 = scan.nextInt();
		int angle3 = scan.nextInt();
		scan.close();
		if (angle1 != 0 & angle2 != 0 & angle3 != 0 & angle1 + angle2 + angle3 == 180)
			return "true";
		else
			return "false";
	}
}
