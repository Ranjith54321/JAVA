/*
				ArrayList      |   		vector
	------------------------------------------------------------
	->	introduced in 1.2      | introduced it 1.0

	->	it is non-syncronized  | it is synchronized  (here thread safty)  forther see in multi threading vide (not yet see)
	----------------------------------------------------------

	here we looking for vector contructos   [--> javap java.util.vector]

	1.) public java.util.Vector();  it is normal version
				dfault capacity = 10
				new capacity = 10*2 = 20

	2.) public java.util.Vector(int user-capacity);
				new Vector(7)
				 new capacity = 7*2 = 14

	3.) public java.util.Vector(int user-capacity, int inc-capacity);  // you can set increment capacity
				new Vector(4,8);
					new capacity = 12 then 20,28,36...

	4.)  public java.util.Vector(java.util.Collection<? extends E>);
			to add one collection data into another 
*/
import java.util.Vector;
import java.util.ArrayList;
class v1{
	public static void main(String[] args) {
		// 1.) normal version initial 10
		Vector<String> v = new Vector<String>();
		v.add("ranjith");
		v.add("dot");
		v.add("doc");
		System.out.println("normal capacity : "+v.capacity()); 

		// 2.) user- capacity version
		Vector<String> v2 = new Vector<String>(2);
		System.out.println("2 -> intial  capacity : "+v2.capacity());
		v2.add("ranjith");
		v2.add("dot");
		v2.add("doc");
		System.out.println("2 -> increment  capacity : "+v2.capacity());

		// user-capaity and user - increment capacity
		Vector<String> v3 = new Vector<String>(2,5);
		System.out.println("2 -> intial  capacity : "+v3.capacity());
		v3.add("ranjith");
		v3.add("dot");
		v3.add("doc");
		System.out.println("2 -> increment  capacity : "+v3.capacity());

		//add another collection into Vecor

		ArrayList<String> as = new ArrayList<String>();
		as.add("as200");
		as.add("ns200");
		as.add("rs200");

		Vector<String> v4 = new Vector<String>(as);
		v4.add("dominar");

		System.out.println("in v4 :"+v4);
	}
}