/*
			List class : 

				1.) ArrayList
				2.) Vector
				3.) Stack (child class of vector)
				4.) LinkedList

				here we are looking for ArrayList 

					it's underlying data structure is resizeable array
*/

import java.util.ArrayList;
class AL1{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);  // here auto bxing is heappened i,e : Integer.valueOf(10);
		a.add(10);  
		a.add(null);  
		a.add("ranjith");
		a.add('a');

		System.out.println(a);
	}
}

// from this we can understand

/*
	collection support :
	 1. duplicate objects [--> 10
	 2. null value [-> null
	 3. hetrogenious data [ 10,a, ranjith these are diffent
	 4. data is preserved i,e the output order  is same as what we entered  ----> [10, 10, null, ranjith, a]





*/