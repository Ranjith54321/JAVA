/*
									serialization on Collection class
				---------------------------------------------------------\

				--> collection classes defaultly implements Colnable and Serializable intefaces 

				--> see the below example bsed on collection class when we use String and Wrapper class no need to implement Serializable interface 
							but other user defined classes that are should be implements Serializable interface

				--> But we use user data on collection eg: ArrayList<Emp>  in thary time the Emp class should implements Serialization***

				--> if you use student obj Emp, obj and product obj then all classes should implements Serializable interface****

				--> writing and reading object should be same in serializable and deserializable process

						eg :    ************ important**********
							in write : 
								 oos.writeObject(s);
								 oos.writeObject(s2);

							 in read :
								ArrayList<String> l1 = (ArrayList<String>)ois.readObject(s);
							 	ArrayList<String> l2 = (ArrayList<String>)ois.readObject(s2);





*/
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class Test1{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ArrayList<String> s = new ArrayList<String>();
		s.add("ranjith");
		s.add("dot");
		s.add("doc");
		s.add("46");

		// serialization
		FileOutputStream fos = new FileOutputStream("test1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		System.out.println("serialization complete...");


		// deseriallization
		FileInputStream fis = new FileInputStream("test1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<String> l1 = (ArrayList<String>)ois.readObject();
		ois.close();
		for(String ss : l1){
			System.out.println(ss);
		}

	}
}