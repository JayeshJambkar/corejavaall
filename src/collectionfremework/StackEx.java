package collectionfremework;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		System.out.println(s.isEmpty()); // true or false method
		s.push("Dholu");
		s.push("Monkey");
		s.push("Cat");
		System.out.println(s);
		
		s.pop();
		System.out.println(s); // remove string value
		
		s.peek();
		System.out.println(s.peek()); //peek last element
		
		System.out.println(s.size()); //Size of element
		int position =s.search("Monkey");
		System.out.println(position);

		s.remove("Monkey");
		Iterator iterator = s.iterator();
		while(iterator.hasNext()) {
		String name=(String) iterator.next(); 
		System.out.println(name);
	}

	}
}
