interface AtringSpace {
	String addSpace(String s);
}

public class Sourse {

	public static String insertSpace(String s) {
	
		return s.chars().mapToObj(c -> (char) c + " ").reduce("", String::concat).trim();
	}

	public static void main(String[] args) {
		System.out.println(Source.insertSpace ("capgemini"));
	}

}
