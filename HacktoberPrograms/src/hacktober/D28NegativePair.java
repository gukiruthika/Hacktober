package hacktober;

import java.util.ArrayList;
import java.util.Scanner;

public class D28NegativePair {

	public static void main(String[] args) {
		D28NegativePair task = new D28NegativePair();
		task.process();
	}
	void process() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number of element");
		System.out.println("Enter the elements");
		while(scan.hasNext()) {
			list.add(scan.nextInt());
		}
		scan.close();
		System.out.println(containsNegativePair(list,1));
	}
	
	boolean containsNegativePair(ArrayList<Integer> list,int index) {
		if(index==list.size())
			return false;
		if(list.get(index-1)==(-1*list.get(index)))
			return true;
		return containsNegativePair(list,index+1);
	}

}
