package edubridge;

import java.util.Scanner;

public class SwitchUsingdoWhileEx {

	public static void main(String[] args) {
		int a;
		// TODO Auto-generated method stub
		int b;
	       Scanner s=new Scanner(System.in); 
	       System.out.println("Enter First Number: ");
	       a= s.nextInt();
	       System.out.println("Enter Second Number: ");
	       b=s.nextInt();
	       
	       while (true){
	          System.out.println("Select an Option...");
	          System.out.println("1. Add");
	          System.out.println("2. Subtract");
	          System.out.println("3. Multiply");
	          System.out.println("4. Divide");
	          System.out.println("5. Exit\n");
	          System.out.println("Type your selection here: ");
	   
	         // String choice=s.nextLine();
	         // int choice=s.nextInt();
	          char choice=s.next().charAt(0);
	          switch(choice){
	              case '1':
	                  System.out.println((a+b));
	                  break;
	              case '2':
	                  System.out.println((a-b));
	                  break;
	              case '3':
	                  System.out.println((a*b));
	                  break;
	              case '4':
	                  System.out.println((a/b));
	                  break;
	              case '5':
	                  System.exit(0);
	              default:
	                  System.out.println("Wrong Choice!!");
	                  break;
	                      
	                
	          }//switch
	       }//while
	}


	}


