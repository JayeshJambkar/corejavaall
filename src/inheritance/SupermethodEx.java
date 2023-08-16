package inheritance;

class Animal {
	public void animalsound() {
		System.out.println("animal make sound");
	}
}
class dog extends Animal{
	public void animalsound() {
	super.animalsound();
		System.out.println("its my dog");
	}
}

public class SupermethodEx {
	public static void main(String[] args) {
		dog d = new dog();
		d.animalsound();
		

	}

}
