/*
										TreeSet

					-> It comes under SortedSet Interface

					-> it's under lying data structure is sorted tree

					-> it default implments Comparable Inteface

					-> so the data should be Homogenious ************

					-> it should not contain null values

					-> it internally implements compareTo interface 

					-> you know String class and all wrapper class support Comparable inteface 


					Constructor and Description
			1.)	TreeSet()
					Constructs a new, empty tree set, sorted according to the natural ordering of its elements.
			2.)	TreeSet(Collection<? extends E> c)
					Constructs a new tree set containing the elements in the specified collection, sorted according to the natural ordering of its elements.
			3.)	TreeSet(Comparator<? super E> comparator)
					Constructs a new, empty tree set, sorted according to the specified comparator.
			4.)	TreeSet(SortedSet<E> s)
					Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set.
					    in this you can add particluar objs from sorted set in to the tree set

					
*/
import java.util.TreeSet;
class tree1{
	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("ranjith");
		t1.add("hike");
		t1.add("bike");
		t1.add("classification");

		System.out.println(t1); // it automatically sorts the  obj's   [bike, classification, hike, ranjith]

		TreeSet<Integer> t3 = new TreeSet<Integer>();
		t3.add(200);
		t3.add(-9);
		t3.add(33);
		t3.add(132);

		System.out.println(t3); // it automatically sorts the  obj's  // [-9, 33, 132, 200]

		TreeSet<Integer> t4 = new TreeSet<Integer>(t3);     // 2-----------> type 2 constructor
		t4.add(55);
		t4.add(-999);
		System.out.println(t4);
		// if contains null value it shows null pointer exception

		// if it it not homogenious then it shoes caste casding exception
		 /*TreeSet t2 = new TreeSet();
			t2.add("ranjith");
			t2.add(20);*/
	}
}