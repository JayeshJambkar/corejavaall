package collectionfremework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> qu=new ArrayDeque<Integer>();
		qu.add(7);
		qu.add(18);
		qu.add(50);
		System.out.println(qu);
		int j=qu.pollLast();
		System.out.println(j);
		System.out.println(qu);
		
			

	}

}
