/*
				here we use three mthods for extracting data from the TreeSet
						1.) subSet(start , end)
						2.) tailSet(start)
						3.) headSet(end)
				these methods return type is SortedSet so we sotre it on SortedSet an re use it on another TreeSet
*/
import java.util.TreeSet;
import java.util.SortedSet;
class set1{
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i=1;i<=10;i++)
			t.add(i);
		System.out.println("in t :"+t);

		// subSet
		SortedSet<Integer> s1 = t.subSet(5,8);
		TreeSet<Integer> t1 = new TreeSet<Integer>(s1);
		System.out.println("subSet(5,8) : "+t1);

		SortedSet<Integer> s2 = t.tailSet(4);
		TreeSet<Integer> t2 = new TreeSet<Integer>(s2);
		System.out.println("tailSet(4) : "+t2);

		SortedSet<Integer> s3 = t.headSet(6);
		TreeSet<Integer> t3 = new TreeSet<Integer>(s3);
		System.out.println("headSet(6) : "+t3);
	}
}