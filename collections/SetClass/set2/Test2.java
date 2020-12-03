/*
			here parent class can hold children object

			parent p = new child()
*/
import java.util.Set;
import java.util.HashSet;
class Test2{
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();    // set ->parent   child -> HashSet
		s.add("ranjith");
		s.add("dot");
		s.add("doc");

		System.out.println(s); // here order is not preserved bcoz it hold hashset's  object 
	}
}