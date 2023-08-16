package garbagecollection;

public class GarbageEx {
	public void finalize () {
		System.out.println("Garbage Collection");
	}
 public static void main(String[] args) {
	 {
		 GarbageEx g=new GarbageEx();
		 g=null;          //here we give null value so message will be print
		 System.gc();
}
	
}
}
