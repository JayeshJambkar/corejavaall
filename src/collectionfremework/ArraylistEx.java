package collectionfremework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> j=new ArrayList<String>();
		j.add("Jai");
		j.add("Shree");
		j.add("Ram");
		j.set(1, "Jay"); //method for replace word
		System.out.println("String Value: "+j);
		
		ArrayList<String> v=new ArrayList<String>(Arrays.asList("Herry","Titanic","Hollywood"));
		//second method of Array list string
		System.out.println(v);
		
		
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(10);
		i.add(15);
		i.add(20);
		System.out.println("Integer Value: "+i);
		
		ArrayList<Integer> h=new ArrayList<Integer>(); //Second method of integer
		Collections.addAll(h, 18, 658, 9, 07);
		System.out.println("Adding Elements: "+h);
		Collections.sort(h);
		System.out.println("Sort the Element"+h);
		System.out.println(h.indexOf(658)); //Count the number
		System.out.println(h.lastIndexOf(658)); //same method

	}

}
