package hacktober;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class D30MemoryGame {

	public static void main(String[] args) {
		D30MemoryGame task = new D30MemoryGame();
		task.process();
	}

	private void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scan.nextInt();
		scan.close();
		printMemoryGame(n);
	}

	private void printMemoryGame(int n) {
		Set<Character> symbols = new LinkedHashSet<>();
		Set<Integer> places = new LinkedHashSet<>();
		char[] memoryGame = new char[n * n];
		Random random = new Random();
		int place;
		char symbol;
		while (symbols.size() < (n * n) / 2 + (n % 2)) {
			symbol = (char) (random.nextInt(93) + 33);
			symbols.add(symbol);
		}
		while (places.size() < (n * n)) {
			place = random.nextInt(n * n);
			places.add(place);
		}

		Object[] placesAr = places.toArray();
		Object[] symbolsAr = symbols.toArray();
		for (int i = 0; i < placesAr.length; i++) {
			if (i < symbolsAr.length)
				memoryGame[(int) placesAr[i]] = (char) symbolsAr[i];
			else
				memoryGame[(int) placesAr[i]] = (char) symbolsAr[i - symbolsAr.length];
		}
		for (int i = 0; i < memoryGame.length; i++) {
			System.out.print(memoryGame[i]+" ");
			if((i+1)%n==0)
				System.out.println();
		}

	}

}
