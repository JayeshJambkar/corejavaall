package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		List<Integer> i=(List<Integer>)Arrays.asList(50,25,66,85); //method
		i.forEach(x->System.out.println(x));
		System.out.println("----");
		i.forEach(System.out::println);
		
		List<String> s=(List<String>)Arrays.asList("abc","xyz");
		s.forEach(j->System.out.println(j));
		System.out.println("----");
		s.forEach(System.out::println);

	}

}
