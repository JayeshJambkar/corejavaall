package access;

public class soloEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		if(x > 5) { //false
		    if(x >= 2) { //true
		        x = 4;
		        System.out.println(x);
		    }else{
		        x = 6;
		        System.out.println(x);
		    }
		} else {
		    x = 8;  //true
		   System.out.println(x);
		}

	}

}
