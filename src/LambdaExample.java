
public class LambdaExample {
	
	    public static void main(String[] args) {
	        String input = "capgemini";
	        String output = input.chars()
	                .mapToObj(c -> (char) c + " ")
	                .collect(Collectors.joining());

	        System.out.println(output);
	    }
	}

