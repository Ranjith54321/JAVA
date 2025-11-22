/*
										LinkedList
				1.) introduced in 1.2
				2.) accepts hetrogenious data
				3.) accepts null values
				4.) allows duplicates
				5.) insertion order is preserved (order not change)
				6.) non-synchronize
				7.) it's Under lying data structure is Doubly linked list
				8.) suppoted cursors -> 1. Iterator 2. ListIterator 


				linkedlist constructors [--> see javap java.util.LikedList]

			  public java.util.LinkedList();   -> 1
 			 public java.util.LinkedList(java.util.Collection<? extends E>);	->2

 			 1.) LinkedList()
 			 	constructs an empty list
 			 2.) LinkedList(Collection<? extends E>c)
 			 	it accepts collection classes
*/

 			 	// these are simimlar we already seen in arraylist methids but some unique methods are there
import java.util.LinkedList;
class ll1{
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("ranjith");
		l1.add("dot");
		l1.add("doc");
		l1.add(null);

		System.out.println(l1);

		l1.add(2,"mid");

		l1.addFirst("aaa");
		l1.addLast("zzz");

		System.out.println(l1);

		l1.remove(1);// index vale
		l1.remove("mid");// obj value
		System.out.println(l1);

		l1.removeFirst();
		l1.removeLast();

		System.out.println("after first last removed : "+l1);


		System.out.println("check empty : "+l1.isEmpty());

		l1.clear();

		System.out.println("check empty : "+l1.isEmpty());

	}
}
