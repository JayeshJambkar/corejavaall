package exceptions;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		try {
			Class.forName("basic.EnumEx");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		}
	}


