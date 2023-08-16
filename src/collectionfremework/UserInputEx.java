package collectionfremework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class student {
	int rollno;
	String name,degree;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public student(int rollno, String name, String degree) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", degree=" + degree + "]";
	}
	
	
}
public class UserInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> al=new ArrayList<student>();
		Scanner s=new Scanner(System.in);
		int details;
		do {
			System.out.println("1 Right");
			System.out.println("2 Display");
			System.out.println("pls enter");
			details=s.nextInt();
			switch(details) {
			case 1:
				System.out.println("Roll no");
				int rollno=s.nextInt();
				System.out.println("Name");
				String name=s.next();
				System.out.println("Degree");
				String degree=s.next();
				al.add(new student(rollno, name, degree));
				break;
				
			case 2:
				Iterator<student> i=al.iterator();
				while(i.hasNext()) {
					student s1=i.next();
					System.out.println(s1);
					
				}
			
	
			}
			
		}while(details!=0);

	}

}
