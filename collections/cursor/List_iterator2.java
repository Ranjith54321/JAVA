/*
		9 methods in ListIterator

		F:\java\collections\cursor>javap java.util.ListIterator
			Compiled from "ListIterator.java"
			public interface java.util.ListIterator<E> extends java.util.Iterator<E> {
			  public abstract boolean hasNext();
			  public abstract E next();
			  public abstract boolean hasPrevious();
			  public abstract E previous();
			  public abstract int nextIndex();
			  public abstract int previousIndex();
			  public abstract void remove();
			  public abstract void set(E);
			  public abstract void add(E);
			}
*/

			// here we gonna see add remove and set() methods in ListIterator cursor previously we done it with ArrayList it self*****
					// but cursor also posiible
import java.util.ArrayList;
import java.util.ListIterator;
class Lt2{
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("ranjith");
		s.add("dot");
		s.add("46");
		s.add("doc");

		System.out.println("ArrayList : "+s);

		ListIterator<String> i = s.listIterator();
		i.add("first");  // intially curosr point to before ranjith that why it add "first" to first position  --> 1

		while(i.hasNext()){
			String str = i.next();
			if(str.equals("46"))
				i.remove();         //----------->  3
			if(str.equals("doc"))    // set ----> 2 
				i.set("doctor_46");
		}
		i.add("last"); // it will added at last

		for(String ss : s){
			System.out.println(ss);
		}
	}
}