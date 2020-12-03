package com.dss;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
class Test{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ArrayList<Emp> a = new ArrayList<Emp>(); // here ArrayList is defaultly serialized but Emp class also should be serialized
		a.add(new Emp(1,"ranjith","aaa"));
		a.add(new Emp(12,"dot","ooo"));
		a.add(new Emp(133,"doc","eee"));
		a.add(new Emp(46,"byke","hhh"));

		// serializable
		FileOutputStream fos = new FileOutputStream("test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();
		System.out.println("serialization complete...");

		// deserialization

		FileInputStream fis = new FileInputStream("test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> el = (ArrayList<Emp>)ois.readObject();
		ois.close();

		for(Emp ee : el){
			System.out.println("id : "+ee.id+"name : "+ee.name+"pass : "+ee.pass);
		}

	}
}

// aother collwction classes also same procedure
// you also serialize normal collection i,e : ArrayLista = new ArrayList(); --> then addd emp, student product data

// after that you need to type caste and use you know

// you can pass multiple collection class also

// writeOnject and readObect oreder should be same