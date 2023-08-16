package operators;

import java.util.Scanner;

public class UnaryExx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer a:");
        a = s.nextInt();
        b = ++a;
        c = a++;
        System.out.println("Result after Pre Increment a:"+a);
        System.out.println("Result after Post Increment c:"+c);
        d = --a;
        System.out.println("Result after Pre Increment a:"+a);
        System.out.println("Result after Pre Decrement d:"+d);
        e = a--;
        System.out.println("Result after Pre Increment a:"+a);
        System.out.println("Result after Post Decrement b:"+--b);
        
        boolean flag = false;  
        //prints the value of success variable  
        System.out.println(flag);  
        //prints the complement of the success variable  
        System.out.println(!flag);
          
          System.out.println(" Inverting the value of a boolean b:"+~b);
        
        

	}

}

	