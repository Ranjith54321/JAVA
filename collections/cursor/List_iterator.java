/*
					ListIterator

		1.) introdued in 1.2
		2.) it only supports List classes 
		3.) so ,it is not universal cursor
		4.) get the obj using listIterator() mrthod
		5.) there are 9 methods are there [----> use javap command to check javap java.util.ListIterator]
		6.) it has all operations
		7.) it is a Bi-directional curosor
		8.) it is a inteface
		9.) it supports both normal and generics [-->objects]

*/
// here we see forward and back ward 
import java.util.ListIterator;
import java.util.ArrayList;
class L1{
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("ranjith");
		s.add("dot");
		s.add("46");
		s.add("doc");

		System.out.println("ArrayList : "+s);

		// *** // read the data by using ListIterator : normal version // *** //
		System.out.println("Normal ListIterator");
		System.out.println("Forward");
		ListIterator lt1 = s.listIterator();
		while(lt1.hasNext()){
			String str = (String)lt1.next();
			System.out.println(str);
		}
		// lt1 initially pointing to befor ranjith (i,e empty loc) then
			// after completion of above traverse lt1 is pointin to after doc 
				// now you revrse the cursor then not a problem
		// if you directly try to reverse it print nothing bcoz there is no data previous

		System.out.println("reverse");
		while(lt1.hasPrevious()){
			String str = (String)lt1.previous();
			System.out.println(str);
		}
		// above is non-generic version so if non generic obj's are there the type caste it and then use

		// *** // read the data by using ListIterator : generic version // *** //
		System.out.println("generic ListIterator");
		System.out.println("Forward");
		ListIterator<String> lt2 = s.listIterator();
		while(lt2.hasNext()){
			String str = lt2.next();
			System.out.println(str);
		}
		System.out.println("reverse");
		while(lt2.hasPrevious()){
			String str = lt2.previous();
			System.out.println(str);
		}
	}
}

/*
-> lt1
	ranjith
	dot
	46
	doc


	after read all above lt1 will
	
	ranjith
	dot
	46
	doc
--> lt1

	now reverse is possible

*/

that 9 methods using javap command :

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