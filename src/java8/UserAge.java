package java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserAge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your date (yyyy-mm-dd format)");
		String st=s.nextLine();
		LocalDate Dob;
		
		Dob=LocalDate.parse(st);
		System.out.println("Age: "+ calcAge(Dob));

	}

	private static int calcAge(LocalDate dob) {
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(dob, currentDate).getYears();
		return age;
	}

}
