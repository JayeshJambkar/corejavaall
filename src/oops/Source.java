package oops;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Source {
	static void printPatters(int n) {

		int rowCount = 1;

		for(int i=n; i>0; i--) {
			for(int j=1; j<i; j++) {
		System.out.print(" ");
			}
		for(int j=1; j<=rowCount; j++) { 
			System.out.print(rowCount+" ");
		}

		System.out.println();

		rowCount++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
				
				printPatters(a);
				printPatters(b);
				printPatters(c);
	}

}
