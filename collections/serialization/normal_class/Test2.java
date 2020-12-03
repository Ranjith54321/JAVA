package com.dss;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable; // this is emp data so we need to import it but collections it is default

class Student implements Serializable{ // this class should implements Serializable interface bcoz this is going to be accesed
	int id;
	String name; 
	transient String pass;// this is producted from other jvm's only default values will be visible for the other jvm's
	Student(int id,String name,String pass){
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
}
class Test2{  // you can define Student class on separate file also not a problem
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Emp e = new Emp(11,"ranjith","xyz");
		Student s = new Student(46,"dot","xyz");

		// serialization
		FileOutputStream fos = new FileOutputStream("com/dss/test2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);  // what order you write here the same order should be write there also other wise it will show casecading exception
		oos.writeObject(s);
		oos.close();
		System.out.println("serializable success...");

		FileInputStream fis = new FileInputStream("com/dss/test2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e1 = (Emp)ois.readObject();                // order must bigiluh✨
		Student s2 = (Student)ois.readObject();
		System.out.println("for sudeetn : id : "+e1.id+" name: "+e1.name+"password : "+e1.pass);
		System.out.println("for sudeetn : id : "+s2.id+" name: "+s2.name+"password : "+s2.pass);
		ois.close();

	}
}