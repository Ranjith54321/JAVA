/*
	here we gonna se add() and addAll()	methods

*/
import java.util.ArrayList;
class Ad{
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);

		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);  // by this approach we can add only one collection at a time
		a2.add(100);
		a2.add(200);

		System.out.println("normal : "+a2);

		ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(11);
		b1.add(22);

		ArrayList<Integer> b2 = new ArrayList<Integer>();
		b2.add(111);
		b2.add(222);

		ArrayList<Integer> b3 = new ArrayList<Integer>();
		b3.addAll(b2);  // by using addAll() we can add multiple obj in the same collection
		b3.addAll(b2);
		b3.add(333);

		System.out.println("addAll : "+b3);
	}
}
