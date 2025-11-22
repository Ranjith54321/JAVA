import java.util.HashSet;
import java.util.LinkedHashSet;
class Test1{
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("ranjith");
		h.add("dot");
		h.add("doc");

		LinkedHashSet<String> lh = new LinkedHashSet<String>(h);
		lh.add("xyz");

		System.out.println("1-> :"+lh);

		HashSet<String> h2 = new HashSet<String>();
		h2.add("ranjith");
		h2.add("dot");
		h2.add("doc");

		LinkedHashSet<String> lh2 = new LinkedHashSet<String>(h);
		lh2.add("xyz");

		HashSet<String> h3 = new HashSet<String>();
		h3.addAll(h2);
		h3.addAll(lh2);
		h3.add("mapiii");
		
		System.out.println("1-> :"+h3);// here last used HashSet so order not preserved


	}
}