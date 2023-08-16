package oops; //Constructor program

public class ClassStudentEx {
	
	int rollno=25;        //taking default value
	String name="jayesh";  //default value
	void display() {
		System.out.println("Student rollno: "+rollno);
		System.out.println("Student name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStudentEx s=new ClassStudentEx();
		s.rollno=50;
		s.name="jay \n";
		s.display();
		
		//nested
		ClassStudentEx s1=new ClassStudentEx();
		s1.rollno=25;
		s1.name="isha\n";
		s1.display();
		
		
		//Default Constructor
		ClassStudentEx s2=new ClassStudentEx();
		s2.display();
		
	}

}
