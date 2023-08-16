package basic;

	public class Learner {
		String college;
		public void LearnerDetails(){
		
			String name="jayesh";
			String degree="BE";
			String location="mumbai";
			int rollnumber=50;
			String college="MGMCET";
			
			System.out.println("student name:" +name );
			System.out.println("student degree:" +degree );
			System.out.println("student location:" +location );
			System.out.println("student rollnumber:" +rollnumber );
			System.out.println("student college:" +college );
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learner l=new Learner();
		l.LearnerDetails();
	
		
	}

}
