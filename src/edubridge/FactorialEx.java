package edubridge;
import java.util.Scanner;
public class FactorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, fact=1;
		Scanner j = new Scanner(System.in);
		System.out.println("Enter the numbar");
		a=j.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		
		System.out.println(+fact);
		}

	}

}
