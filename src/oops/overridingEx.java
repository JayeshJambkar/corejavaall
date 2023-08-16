package oops;
//Creating a parent class. 
	class Books{
	//defining a method 
	void run()
	{
	System.out.println("Book not in stock");
	}
	}

	//Creating a child class
	public class overridingEx extends Books{
		void run()
		{
		System.out.println("Book is available");
		}
		public void main(String[] args) {
		overridingEx obj = new overridingEx(); //creating object 
		obj.run(); //calling method
		}
		}


