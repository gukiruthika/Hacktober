package hacktober;

public class D14PrintAlphabets {

	public static void main(String args[]) {
		printAlphabets();
	}
	static void printAlphabets() {
		char k='a';
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			for(char j=(char)(i+1);j<='z';j++) {
				System.out.print(j);
			}
			for(char j='a';j<k;j++) {
				System.out.print(j);
			}
			System.out.println();
			k++;
		}
	}
}
