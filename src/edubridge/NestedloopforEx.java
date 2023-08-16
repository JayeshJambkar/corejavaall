package edubridge;

public class NestedloopforEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=3;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println( );
		}

	}

}*/
	
		int row=5;
		for (int i=0; i<row; i++) {
			for (int j= row-i;  j>1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
			}
		}
