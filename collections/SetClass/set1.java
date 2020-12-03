/*
											Iterable (I)      (root inteface of collection)
											   |  (extends)
											Collection (I)
											   |  (extends)
											   Set (I)    
							(implements)      /  \   
											 /    \    (extends)
								     HashSet (C)  SortedSet (I)
							(extends) 	/			\
									   /			 \    (extends)
								LinkedHashSet (C)    NavigableSet (I)
								     					\	
								    					 \   (implements)
														TreeSet	(C)

				     Set not allowed duplicates, but list class allows


			--> HashSet: 
			------------------
				1.) introduced in 1.2
				2.) hetrogenious is allowed
				3.) null values is allowed
				4.) duplicates not allowed *****
				5.) Insertion is not preserved (input order is different from output)
				6.) non-synchronized (1.2 onwards non- synchronized)
				7.) underlying data structures **hashtable**
				8.) cursor -> iterator only

				4 constructors :

				1  public java.util.HashSet();
				2  public java.util.HashSet(java.util.Collection<? extends E>);
				3  public java.util.HashSet(int, float);
				4  public java.util.HashSet(int);

				1  public java.util.HashSet(); ->normal 
												load factor -> memory representation
				      inital capacity -> 16 load factor -> 0.75
					  load factor range 0.0 to 1.0

				2  public java.util.HashSet(int);
						initial capacity

				3 public java.util.HashSet(int, float);
				      initial capacity and load factor

				4  public java.util.HashSet(java.util.Collection<? extends 
*/
import java.util.HashSet;
import java.util.LinkedHashSet;
class set1{
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("ranjith");
		h.add("abc");
		h.add("dot");
		h.add("ranjith"); // this will not taken bcoz duplocates are not allowed in set so next first value is taken

		System.out.println("HashSet order preserved : "+h); // order is not preserved

		// so to use LinkedHashset the order is preserved

		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("ranjith");
		lh.add("abc");
		lh.add("dot");
		lh.add("ranjith");
		System.out.println("LinkedHashSet order preserved : "+lh);

		// here you can chech next value is not allowed
		HashSet<String> h2 = new HashSet<String>();
		System.out.println(h2.add("ranjith")); // true
		System.out.println(h2.add("ranjith")); // false
		System.out.println(h2.add("ranjith")); // false
		System.out.println(h2.add("abc")); // true
		System.out.println("in  h1 : "+h2);

	}
}