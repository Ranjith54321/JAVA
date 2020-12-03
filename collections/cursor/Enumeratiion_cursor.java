/*
		we can access the collection data using : (nothing but access the obj's)
			1.) for each loop
			2.) get()
			3.) cursor
					1.) Enumeration   (interface)
					2.) Iterator 	  (interface)
					3.) ListIterator  (interface)

    ---> Enumeration cursor:
        --> it can read only legacy class (see below points)****


        1.) It introduced in 1.o version

        2.) the classes which are introduced in 1.o these are called legacy classes

        3.) It is not a Universal cursor (not for all collection class)

        4.) To get the obj using elements()
	
		5.) It has two methods hasMorelement() and nextelement()

		6.) Only do read operation

		7.) forward cursor

		8.) it is an Interface

		9.) it support normal and generics


		--> Enumuration Limitatos :

		1.) only support legacy classes
		2.) it is not a universal cursor
		3.) only read operation
		4.) forward cursor
		
		---> here we use Vector class bcoz it is introduced in 1.0 so is legacy class

		it is same as Arraylist

		main difference is vector is syncronized Arraylist non-syncronized

				sysnchronized -> thread safty
				non-synchronize -> no thread safty

		ArrayList is introduced in 1.2 so is not a legacy class 

		so Enumuration nit support

	 	F:\java\collections\ArrayList>javap java.util.Enumeration
	Compiled from "Enumeration.java"
	public interface java.util.Enumeration<E> {
	  public abstract boolean hasMoreElements();  ---> method (1)  to check the element
	  public abstract E nextElement();  ---> method (2)  to read the element

*/
import java.util.Enumeration;
import java.util.Vector;

class Ab{
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();   // you can make non-generic vector also
		v1.add("Ranjith");    
		v1.add("dot");
		v1.add("abc");
		v1.add("46");

		System.out.println(v1);

		// read the data by using Enumeration : normal version 
		Enumeration e = v1.elements(); // get the data from vector in object type
		while(e.hasMoreElements()){
			String s = (String)e.nextElement();  // conert object tye to String
			System.out.println(s);
			/*Object o = e.nextElement();     // you can try this 
			if(o instanceof String)
				System.out.println(o);*/
		}
		// above is non-generic version so if non generic obj's are there the type caste it and then use


		// read the data by using Enumeration : generic version 
		Enumeration<String> e2 = v1.elements();
		while(e2.hasMoreElements()){
			String s = e2.nextElement();
			System.out.println(s);
		}

	}
}

// so in cursor we can make generic version 