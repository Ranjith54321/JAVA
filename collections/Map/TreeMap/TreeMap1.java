/*
									TreeMap
					in TreeMap it store data in sorted order so the data must be homogenious

					it is from SortedMap Interface

					like TreeSet int TreeMap also data is in sorted order

					so to perform tree set follwing coditions must needed
						1-> data must be homogenious
						2-> data should implements  comparable interface (String and Wrapper class defaultly implements comparable )
							but when you use user defined data then it should be in mind

					Sorting is heapen based on keys*****



			Constructor and Description : (4 consrutors)

				1.) TreeMap()  // it default so it defaultly implemets Comparable 
					Constructs a new, empty tree map, using the natural ordering of its keys.

				2.) TreeMap(Comparator<? super K> comparator)  // you your win sort logic using Comparator
					Constructs a new, empty tree map, ordered according to the given comparator.

				3.) TreeMap(Map<? extends K,? extends V> m) //
					Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.

				4.) TreeMap(SortedMap<K,? extends V> m)
					Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map.
							--> use sunMap to extract some data from one TreeMap get through SortedMap then put in to another TreeSet

*/
import java.util.TreeMap;
class treemap1{
	public static void main(String[] args) {
		TreeMap<String, Integer> t1 = new TreeMap<String,Integer>();
		t1.put("ranjith",111);
		t1.put("doc",5);
		t1.put("axile",263);
		t1.put("boss",999);

		System.out.println(t1); // {axile=263, boss=999, doc=5, ranjith=111}


		TreeMap<Integer,String> t2 = new TreeMap<Integer,String>();
		t2.put(99,"ranjith");
		t2.put(1,"ns");
		t2.put(5,"rs");
		t2.put(65,"dl");

		System.out.println(t2);   // {1=ns, 5=rs, 65=dl, 99=ranjith}
	}
}

// if Map has hetro genious data it creates ClassCade Exception

// it map comntains null values it create Null ponter exception

//