/*
		remove duplicate obj using hashset
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
class Test3{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("ranjith");
		l.add("doc");
		l.add("dot");
		l.add("ranjith");

		System.out.println("in ArrayList : "+l);

		HashSet<String> h = new HashSet<String>(l);
		h.add("xyz");

		System.out.println("in HashSet : "+h);

		TreeSet<String> ts = new TreeSet<>(l);

		System.out.println("in TreeSet from ArrayList : "+ts);

	}
}