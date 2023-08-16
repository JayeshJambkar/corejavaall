import java.util.Arrays;
import java.util.Scanner;

public class Source {
	public static int getSecondSmallest(int[]arr) {
		if (arr.length < 2) {
		throw new IllegalArgumentException("Array too small");
		}
		int[] copy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copy);
		return copy[1];
	}
	public static void main(String[] args) {
		int[] arr= {23, 45, 32 , 22, 20, 96};
		int secondsmallest = Source.getSecondSmallest(arr);
		System.out.println(secondsmallest);
	}
}
		