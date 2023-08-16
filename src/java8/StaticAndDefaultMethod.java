package java8;
interface herry{
	void abstractmethod();  //abstract  method
	default void display() {   //default method
		System.out.println("herry");
	}
	static void display1() {   //static method
		System.out.println("Static Method");
	}
}
interface john{
	void abstractmethod1();
	default void display2() {
		System.out.println("Hello im here");
	}
	static void display3() {
		System.out.println("Ok Bye");
	}
}

public class StaticAndDefaultMethod implements herry, john{

	public static void main(String[] args) {
		StaticAndDefaultMethod s=new StaticAndDefaultMethod();
		
		s.display();
		herry.display1();
		s.abstractmethod();
		s.abstractmethod1();
		s.display2();
		john.display3();

	}

	@Override
	public void abstractmethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract");
		
	}

	@Override
	public void abstractmethod1() {   //abstract method end here
		// TODO Auto-generated method stub
		System.out.println("Please Come in");
		
	}

}
