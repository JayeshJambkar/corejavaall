package publicAccess;

import oops.parametriesEx;

public class ProtectedEx {
	 protected void display() {
	        System.out.println("I am an animal");
	    }
	}

	class Dog extends parametriesEx {
	    public static void main(String[] args) {

	        // create an object of Dog class
	        Dog dog = new Dog();
	         // access protected method
	        dog.display();
	    }
	}


