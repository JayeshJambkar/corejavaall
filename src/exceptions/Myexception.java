package exceptions;

public class Myexception {
	Exception{
		public Myexception(String msg) {
			super(msg);
		}
		
	}
	public class InvalidAgeExample {
	    public String checkAge(int age) throws Myexception {
	    	if(age>18) {
	    		return "valid age";
	    	}else {
	    		throw new Myexception("invalid age");
	    	}
	    	
	    }
		public static void main(String[] args)  {
			InvalidAgeExample i=new InvalidAgeExample();
			try {
				String s=i.checkAge(24);
				System.out.println(s);
				
			} catch (Myexception e) {
				System.out.println(e);
				
			}
			

		}

	}

}
