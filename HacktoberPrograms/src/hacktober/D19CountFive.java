package hacktober;

import java.util.Scanner;

public class D19CountFive {

	public static void main(String[] args) {
		D19CountFive task = new D19CountFive();
		task.process();
	}

	void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int size = scan.nextInt();
		scan.close();
		printRandomNumbers(size);
	}
	
	void printRandomNumbers(int size) {
		int[][] arr = new int[size][size];
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=(int)(Math.random()*5+1);
				System.out.print(arr[i][j]);
				if(arr[i][j]==5)
					count++;
			}
			System.out.println();
		}
		System.out.println("\nNumber of 5 -> "+count);
	}

}
