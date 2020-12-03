package com.dss;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test{
	void serial() throws IOException{  // function pass exception to main method then, main method pass it to jvm
		Emp e = new Emp(11,"ranjith","xyz");
		FileOutputStream fos = new FileOutputStream("com/dss/abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("serializable success...");
	}
	void deserial() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("com/dss/abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp)ois.readObject();
		System.out.println("id : "+e.id+" name: "+e.name+"password : "+e.pass);
		ois.close();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Test t = new Test();
		t.serial();
		t.deserial();
	}
}

// you can also use multiple classes to seriallize
			// --- >see test 2