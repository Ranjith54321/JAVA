package com.dss;
import java.util.LinkedList;
import java.util.ListIterator;
class Test1{
	public static void main(String[] args) {
		Book b1 = new Book(444,"c++");

		LinkedList<Book> l1 = new LinkedList<Book>();
		l1.add(new Book(111,"C_prog"));
		l1.add(new Book(222,"python"));
		l1.add(new Book(333,"go"));
		l1.add(b1);

		Book b2 = new Book(555,"java"); // create book obj here

		// remove from linked list using listIterator
		ListIterator<Book> lt = l1.listIterator();
		lt.add(b2);    // --------------------> initially cursor pointing to top so it add obj at top
		lt.add(new Book(666,"matlab"));  // you can add obj with the help of cursor also

		while(lt.hasNext()){
			Book b = lt.next();
			if(b.name.equals("go"))
				lt.remove();
		}

		// print using for each loop

		for(Book bb : l1){
			System.out.println(bb.id+" "+bb.name);
		}

	}
}