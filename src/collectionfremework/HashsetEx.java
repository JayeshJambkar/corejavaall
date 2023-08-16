package collectionfremework;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> c=new HashSet<String>();
		c.add("jayesh");
		c.add("Raj");
		c.add("Pravin");
		System.out.println(c);
		c.add("isha");
		System.out.println(c);
		System.out.println("Retrive Data using interator");
		Iterator<String> g=c.iterator();
		while (g.hasNext()) {
			String s=g.next();
			System.out.println(s);
			
		}

	}

}
