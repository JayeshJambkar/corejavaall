package oops;

import java.util.Scanner;

 class Amsterdam {
	public int countAm(String s) {
		String abc = s.toLowerCase();
		//System.out.println("abc :"+abc);
		int cnt = 0;
		String a[] = abc.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("am")) {
				cnt = cnt + 1;
			}
			
		}
		return cnt;

	}
}

 public class OccuranceAm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the String");
		String s = scan.nextLine();
		Amsterdam a1 = new Amsterdam();
		int count =a1.countAm(s);
		System.out.println(count);
		//System.out.println(count);

	}

}

