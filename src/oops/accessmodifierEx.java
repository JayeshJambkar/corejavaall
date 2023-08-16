package oops;

public class accessmodifierEx {

	private String surname="herry";
	private void display() {
	System.out.println(surname);
	}


	//}
	//public class Main {
    public static void main(String[] main){
        accessmodifierEx d = new accessmodifierEx();

        // access the private variable using the getter and setter
        d.surname="Joy";
        //System.out.println(d.surname);
        d.display();
        
    }
}