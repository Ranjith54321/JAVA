/*
	one Obj 		|			Collections  of data
------------------------------------------------------
	add() 			|			addAll()
	contains()		|			containsAll()
	remove()		|			removeAll()
					|
					|	removeAll()		|			retainAll()   (the both handles collection of data)
--------------------------------------------------------
*/
package com.dss;
import java.util.ArrayList;
class Ae{
	public static void main(String[] args) {
		Emp e1 = new Emp(1,"Ranjith");
		Emp e2 = new Emp(2,"dot");
		Emp e3 = new Emp(3,"the");
		Emp e4 = new Emp(4,"doc");

		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);  // add--------> 1
		a1.add(e2);

		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);  // addAll--------> 1
		a2.add(e3);
		a2.add(e4);

		System.out.println("a2 contains e1 : "+a2.contains(e1)); // ture     --------> 2
		System.out.println("a2 contains a1 : "+a2.containsAll(a1)); // ture   --------> 2
		a2.remove(e1);
		System.out.println("a2 contains e1 : "+a2.contains(e1));  // false 	--------> 2
		System.out.println("a2 contains a1 : "+a2.containsAll(a1)); // false 	--------> 2

		for(Emp ee : a2){
			System.out.println(ee.no+" "+ee.name);
		}

		a1.remove(e1); // it remove only single object  --------> 3
		a2.removeAll(a1); // it remove the one collection data here a1 is coolection --------> 3

		// a2.removeAll(a1) --> removes all a1 obj's

		a2.retainAll(a1);

		// a2.retainAll(a1);  --> remove all a2 obj's a1 will safe




		for(Emp ee : a2){
			System.out.println(ee.no+" "+ee.name);
		}

	}
}