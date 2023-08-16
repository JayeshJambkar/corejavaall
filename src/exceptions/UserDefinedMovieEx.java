package exceptions;

public class UserDefinedMovieEx {

	
		// TODO Auto-generated method stub
		static void validAge (int age) {
			if (age>18) {
			System.out.println("Welcome to Movie");
		}
			else {
				throw new AbstractMethodError("invalid Age");
				
			}
	}
		public static void main(String[] args) {
			validAge(15);
		}
}
