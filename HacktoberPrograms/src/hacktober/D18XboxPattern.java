package hacktober;

import java.util.Scanner;

public class D18XboxPattern {

	public static void main(String[] args) {
		D18XboxPattern task = new D18XboxPattern();
		task.process();
	}

	void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int size = scan.nextInt();
		scan.close();
		printXbox(size);

	}
	
	void printXbox(int size) {
		char[][] arr = new char[size][size];
		int k=size-1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==0|i==size-1|j==0|j==size-1|i==j|k==j) {
					arr[i][j]='#';
				}
				else {
					arr[i][j]=' ';
				}
			}
			k--;
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
