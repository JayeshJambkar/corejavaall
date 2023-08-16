package oops;


public class parametriesEx { 
	int a;
	String b;
	
	public parametriesEx(int a, String b) {
		this.a=a;
		this.b=b;
	}
	public parametriesEx(parametriesEx p) {
		a=p.a;
		b=p.b;
		
	}
	public parametriesEx() {  //copy constructor
		a='a';
		b="b";
		
	}
		
	
	protected void display() {
		System.out.println("variable : "+a);
		System.out.println("Variable : "+b);
	}
	
	public static void main(String[] args) {
		
		parametriesEx p=new parametriesEx(50 , "50");
		p.display();
		
		parametriesEx p1=new parametriesEx(p);
		p1.display();
	}
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return j+i;
	}

}
