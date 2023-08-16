package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StudentEx ss=new StudentEx();
		ss.id=50;
		ss.name="jay";
		ss.degree="BE";
		FileOutputStream os=new FileOutputStream("fileexample.txt");
		ObjectOutputStream js=new ObjectOutputStream(os);
		js.writeObject(ss);
		js.close();
		os.close();
		System.out.println("Saved in a File");
	}

}
