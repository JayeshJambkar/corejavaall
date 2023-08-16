package oops;

abstract class Watch {
	abstract void show();

	void WatchBrand() {
		System.out.println("Brand");
	}

	public static void display() {
		System.out.println("display");
	}
}

class Allensholly extends Watch {

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Allensholly");
	}

}

class Titan extends Watch {

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Titan");
	}

}

public class AbstractClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w = new Allensholly();
		w.show();
		Watch h = new Titan();
		h.show();
		h.WatchBrand();
		Allensholly.display();
		Titan.display();
	}
}
