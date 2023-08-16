package edubridge;

import java.util.Scanner;

public class DoWhileloopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	    int number = 0;
	    Scanner input = null;
		do {
	      sum += number;
	      System.out.println("Enter a number");
	      number = input.nextInt();
	    } while(number >= 0); 
		   
	    System.out.println(sum);
	    input.close();
	  }
}

