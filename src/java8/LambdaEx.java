package java8;

public class LambdaEx {
	interface Sum {
		int a(int x, int y);
	}
	public static void main(String[] args) {
		Sum s=(int x, int y)->x+y;
		Sum i=(int x, int y)->x*y;
		Sum j=(int x, int y)->x/y;
		Sum k=(int x, int y)->x-y;
		System.out.println(s.a(3, 6));
		System.out.println(i.a(5, 2));
		System.out.println(j.a(25,5));
		System.out.println(k.a(20,5));

	}

}
