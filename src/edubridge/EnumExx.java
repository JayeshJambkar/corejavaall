package edubridge;

public enum EnumExx {
		Winter(0),Summer(1), Monsoon(2);
		private int index;
		
		private EnumExx(int index) {
			// TODO Auto-generated constructor stub
			this.index=index;
		}
		public static void main(String[] args) {
			System.out.println(EnumExx.Monsoon.index);
			
		}
			
		}

