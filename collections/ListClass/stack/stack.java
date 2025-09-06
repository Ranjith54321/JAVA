/*
			list clas:
				1.) ArrayList
				2.) Vector
				3.) Stack (child class of vector)
				4.) LinkedList

	here we see stack [--> LIFO last in first out ]

	it has 4 methods:
	  push()   pop() 	peek()	empty()

	  clear() -> common for collection

	  F:\java\collections\vector\vector3>javap java.util.Stack
Compiled from "Stack.java"
public class java.util.Stack<E> extends java.util.Vector<E> {
  public java.util.Stack();
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  public synchronized int search(java.lang.Object);
}

*/
import java.util.Stack;
class st{
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("ranjith");
		s.push("dot");
		s.push("doc");  //-----> 1. push()
		s.push("ranjith");              

		System.out.println("stack : "+s);

		System.out.println("top of the stack : "+s.peek()); // ----> 2. peak()

		System.out.println("search the obj in stack : " +s.search("ranjith")); // it returns the position not the index the first added obj shows last position 

		s.pop();  //----------> 3. pop()

		System.out.println("after pop of the stack : "+s);

		System.out.println("stack is empty : "+s.empty());  // ----->  4. empty()

		s.clear(); ///---> it collection class method list is also a collection class so it supports 

		System.out.println("stack is empty : "+s.empty());


	}
}

## output:
stack : [ranjith, dot, doc, ranjith]
top of the stack : ranjith
search the obj in stack : 1
after pop of the stack : [ranjith, dot, doc]
stack is empty : false
stack is empty : true