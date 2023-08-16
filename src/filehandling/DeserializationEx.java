package filehandling;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.ObjectInputStream;


public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream nos=new FileInputStream("fileexample.txt");
		ObjectInputStream jos=new ObjectInputStream(nos);
		StudentEx s=null;
		s=(StudentEx) jos.readObject();
		s.display();
		//System.out.println(s.id+" "+s.degree);
		jos.close();
		nos.close();
		

	}

}
