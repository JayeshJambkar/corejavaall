package basic;
class Student{
		static int fee;
		static String name="jayesh";		
}
public class system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.fee=1000;
		System.out.println("fee : "+Student.fee);
		Student.name="jayesh";
		System.out.println("Name :"+Student.name);	
	}

}
