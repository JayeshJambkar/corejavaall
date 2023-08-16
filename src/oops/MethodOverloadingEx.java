package oops;

public class MethodOverloadingEx {
	
	    private static void display(int a){
	        System.out.println("Arguments: " + a);
	    }

	    private static void display(int a, int b){
	        System.out.println("number: " + a + " and " + b);
	    }
	    
	    private static void display(int a, int b, int c){
	        System.out.println("total number: " + a + " and " + b + " and "+c);
	    }

	    public static void main(String[] args) {
	        display(1);
	        display(1, 4);
	        display(1, 4, 8);
	    }
	}

	