package thread;

class ThreadFirst implements Runnable{  //method //use 3class for implement.
	public void run() {
		System.out.println("Enter First Thread: ");
		for(int i = 1;i<6;i++){
			System.out.println(i);
		}
		
		
	}
	
}

class ThreadSecond extends Thread{ //extend keyword use so compulsory thread is use.
	
	public void run() {
		System.out.println("Enter Second Thread: ");
		for ( int i=6;i<=10;i++){
			System.out.println(i);
		}
		
	}
	
}

class ThreadThird extends Thread{
	

	public void run() {
		int num=5;
		System.out.println("Enter Third Thread: ");
		for (int i=1;i<=10;i++){
			System.out.println(num*i);
		}
	
	}
}
public class MultiThreadUsingAtAOneTime {

	public static void main(String[] args) {
		ThreadFirst tf= new ThreadFirst();
		Thread t= new Thread(tf);
		tf.run();
		ThreadSecond tf1=new ThreadSecond();
		tf1.run();
		ThreadThird tf2 = new ThreadThird();
		tf2.run();

	}

}
