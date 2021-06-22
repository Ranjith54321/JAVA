/*
		Iterator : 
		it is introduced in 1.2 version

		it supports both legacy and normal collection classes  

		it is Universal cursor**** supports all collection class

		to get the obj use iterator()

		it has 3 methods:
			1.) hasNext()  -> to chech obj is availble
			2.) next()   -> to read the obj
			3.) remove() -> rmove the obj  ******<------

		forward cursor

		it is interface

		it supports normal and generic Intertor

*/
import java.util.ArrayList;
import java.util.Iterator;
class Ac{
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("ranjith");
		a.add("dot");
		a.add("46");

		System.out.println(a);

		// *** // read the data by using Iterator : normal version // *** //
		Iterator i = a.iterator();    
		while(i.hasNext()){           
			String s = (String)i.next();
			System.out.println(s);
		}
		// above is non-generic version so if non generic obj's are there the type caste it and then use
		
		// *** // read the data by using Iterator : generic version // *** //
		Iterator<String> i2 = a.iterator();
		while(i2.hasNext()){
			String s = i2.next();
			System.out.println(s);
		}

		//  for remove()
		Iterator<String> i3 = a.iterator();
		while(i3.hasNext()){
			String s = i3.next();
			if(s.equals("46"))
				i3.remove();
		}

		System.out.println(a);

	}
}