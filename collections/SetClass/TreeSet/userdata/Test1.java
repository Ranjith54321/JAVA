/*
					Tree set defaulty accepts String and wrapper class anthen sor that data assceding order by with the help of comparable 

					here we use same String and wrapper class but i need in desscending order that is not heappened in comparable so we use comparator here

					
					it is constructor type 3 :

					3.)	TreeSet(Comparator<? super E> comparator)
					Constructs a new, empty tree set, sorted according to the specified comparator.
					
*/
import java.util.TreeSet;
import java.util.Comparator;
class Test1{
	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<String>(new comp1()); // here call the class through create object
		t1.add("ranjith");
		t1.add("abc");
		t1.add("dot");
		t1.add("ranjith");					/// default output : [abc, dot, ranjith] // duplicates are deleted automatically

		System.out.println(t1); // now : [ranjith, dot, abc]

		TreeSet<Integer> t3 = new TreeSet<Integer>(new comp2());
		t3.add(200);
		t3.add(-9);
		t3.add(33);
		t3.add(132);

		System.out.println(t3); // [200, 132, 33, -9]
	}
}

// here implement Comparator inteface to do the operation  bcoz comparable automatically heappened here (treset) but compapator is for manual work
class comp1 implements Comparator<String>{
	public int compare(String s1, String s2){
		return -s1.compareTo(s2);
	}
}

// this is for integer sort
class comp2 implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2){
		//return -i1.compareTo(i2); // here we have Integer onj not int so we can do like this
		if(i1==i2)          // this normal version also possible bcoz auto unboxing is heappened
			return 0;
		else if(i1<i2)
			return 1;
		else
			return -1;
	}
}
