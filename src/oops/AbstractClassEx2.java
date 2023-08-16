package oops;

abstract class Bird {
	abstract void makeSound();
}

class Duck extends Bird {
	public void makeSound() {
		System.out.println("sound of Duck: Quack Quack");
	}
}

class Owl extends Bird {
	public void makeSound() {
		System.out.println("sound of Owl: Hoot Hoot");
	}
}

public class AbstractClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Duck d = new Duck();
			d.makeSound();
			Owl c = new Owl();
			c.makeSound();
		}
	}

}