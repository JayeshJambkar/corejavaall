package inheritance;

	class Student {             //super class
		String name;
		
		Student(String jj){
			name=jj;
			System.out.println(name);
		}
	}
		//subclass
		class developer extends Student{     
	String role;
	String name;
	
	public Developer(String role, String name) {
		
		super(name);
		this.role=role;
		System.out.println(role);
	}
	
}
	public class SingleInheritance {   //main class
	

	public static void main(String[] args) {
		developer d1= new developer("JAVA FULL STACK");
		
	}
		
	}

	


