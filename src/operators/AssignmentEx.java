package operators;

public class AssignmentEx {

	public static void main(String[] args) {
		 // create variables
	    int a = 5;
	    int b = 10;

	    
	    b = a;
	    System.out.println("var using =: " + a);

	    
	    b += a;
	    System.out.println("var using +=: " + b);

	    b *= a;
	    System.out.println("var using *=: " + b);
	    
	    b /= a;
	    System.out.println("var using /=: " + b);
	    
	    b ^= a;
	    System.out.println("var using ^=: " + b);
	    
	    b %= a;
	    System.out.println("var using : " + b);
	  }
	

	}


