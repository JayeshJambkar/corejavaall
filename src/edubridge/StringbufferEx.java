package edubridge;

public class StringbufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hey");
		sb.append(":Hi");
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb);
		
		sb.replace(0, 4, "BE");
		System.out.println(sb);
		
		sb.delete(2, 4);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.insert(1, 'i');
		System.out.println(sb);
	}

}
