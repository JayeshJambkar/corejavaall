package edubridge;

import java.util.Scanner;

public class MarksheetSwitchEx {
	public String printGrade (int score) {
	if(score<0 && score>100) {
		return "invalid";
		}

		switch (score/10) {
		case 10:
			return "a+";

		case 9:
			return "a";
		default: return "f";
		
			}
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
			MarksheetSwitchEx m=new MarksheetSwitchEx();
			String result= m.printGrade (score); 
			System.out.println("my grade: "+result);
			}

	}


