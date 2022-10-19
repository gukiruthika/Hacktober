package hacktober;

import java.util.Arrays;
import java.util.Scanner;

public class D15AlphabetRangoli {
	/*
----c----
--c-b-c--
c-b-a-b-c
--c-b-c--
----c----
	 */

	public static void main(String[] args) {
		D15AlphabetRangoli alphabetRangoli =  new D15AlphabetRangoli();
		alphabetRangoli.pattern();
	}
	void pattern() {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			char[][] pattern = new char[(2*n)-1][(4*n)-3];
			int k=1;
			for(int i=0;i<pattern.length;i++) {
				for(int j=0;j<pattern[0].length;j++) {
					Arrays.fill(pattern[i], '-');
				}
			}
			for(int j=0;j<pattern[0].length;j=j+2) {
				pattern[n-1][j]=(char)('a'+n-k);
				if(j<(2*n-2))
					k++;
				else
					k--;
			}
			for(int i=n-2;i>=0;i--) {
				for(int j=0;j<pattern[0].length;j++) {
					char l = pattern[i+1][j];
					if(l!='-'&l!=(char)'a'+n-1)
						pattern[i][j]=(char)(l+1);
				}
			}
			for(int i=n;i<pattern.length;i++) {
				for(int j=0;j<pattern[0].length;j++) {
					char l = pattern[i-1][j];
					if(l!='-'&l!=(char)'a'+n-1)
						pattern[i][j]=(char)(l+1);
				}
			}
			for(int i=0;i<pattern.length;i++) {
				for(int j=0;j<pattern[0].length;j++) {
					System.out.print(pattern[i][j]);
				}
				System.out.println();
			}
		}
	}

}
