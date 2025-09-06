/*
	these two are in the Collections class (see s)  (--> collection is the root interface of collections )
	methods : 
	1.) swap(ArrayList_name,index1,index2) --> to swap
	2.) subList(start_index,end_index)  start_index (includes)  end_index(excludes) --. to copy obj's from another colection
*/
import java.util.ArrayList;
import java.util.Collections; // in this class only contains swap() and subList()
class Ag{
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);

		Collections.swap(a1,0,2); // swap 10 and 30
		System.out.println(a1);

		ArrayList<Integer> a2 = new ArrayList<Integer>(a1.subList(0,2)); // /0 will not include 
		a2.add(111);
		System.out.println(a2);
	}
}