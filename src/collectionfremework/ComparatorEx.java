package collectionfremework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Book {
	int price;
	String brandname;
	public Book(int price, String brandname) {
		super();
		this.price = price;
		this.brandname = brandname;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", brandname=" + brandname + "]";
	}	
}

class Sortbyprice implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		
		return o1.price-o2.price;
		
	}
}
	class Sortbybrandname implements Comparator<Book>{

		public int compare(Book o1, Book o2) {
			// TODO Auto-generated method stub
			return o1.brandname.compareTo(o2.brandname);   //use for string
		
		}
		
	}
	
	

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Book> v=new ArrayList<Book>();
		v.add(new Book(69, "jay"));
		v.add(new Book(50, "ishh"));
		v.add(new Book(38, "nivi"));
		//Collections.sort(v,new Sortbyprice());
		Collections.sort(v, new Sortbybrandname());
		System.out.println(v);
		
		

	}

}
