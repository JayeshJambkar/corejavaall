package java8;

public class EvenAndReverse {
	interface Evenodd{
		boolean s(int n);
	}
	interface Reverse {
		String rev(String g);
	}

	public static void main(String[] args) {
		Evenodd eo=(int n)->n%2==0;
		System.out.println(eo.s(16));
		
		Reverse rs=(String g)->
		{
			String rev="";
			for(int i = g.length()-1;i>=0;i--) {
				char w = g.charAt(i);
				rev = rev+w;	
			}
			return rev;
		};
		System.out.println("Rev :"+rs.rev("Bhot Hard"));

	
	}

}
