package publicAccess;

class Demo{
	int a=2;
	Demo(int b){
		a=b;
	}
	
	void display() {
		int b=5;
		System.out.println(25);
	}
}
public class publicaccessEx {
	private int a;
	private int i=2;
	
	public void test() {
		System.out.println(5);
	}

	public static void main(String[] args) {
		publicaccessEx p= new publicaccessEx();
		Demo d= new Demo(20);
		d.display();
		System.out.println(d.a);
		p.a=2;
		
	}

}