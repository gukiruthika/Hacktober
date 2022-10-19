package hacktober;

import java.util.Scanner;

public class D13AddArrayRecursion {

	public static void main(String[] args) {
		D13AddArrayRecursion task = new D13AddArrayRecursion();
		task.process();
	}

	void process() {
		System.out.println("Enter number of elements");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter elements");
		for (int i = 0; i < length; i++)
			arr[i] = scan.nextInt();
		int[] arr2 = addOneToElement(arr, 0);
		for (int i : arr2)
			System.out.print(i + " ");
		scan.close();
	}

	static int[] addOneToElement(int[] arr, int i) {
		if (i == arr.length) {
			return arr;
		}
		arr[i]++;
		return addOneToElement(arr, (i + 1));
	}

}
