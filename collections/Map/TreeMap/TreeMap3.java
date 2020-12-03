/*
			3. TreeMap(SortedMap<K,? extends V> m)

					Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map.
							--> use sunMap to extract some data from one TreeMap get through SortedMap then put in to another TreeSet


							like in the TreeSet here also we gonna use three methods 
							1.) subMap(start, end)        |
							2.) tailMap(start)     		  |----> all of these return types are SortedMap
							3.) headMap(end)       		  |

*/
import java.util.TreeMap;
import java.util.SortedMap;
class treemap3{
	public static void main(String[] args) {
		TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();
		t1.put(55,"ranjith");
		t1.put(7,"dot");
		t1.put(1,"ranjith");
		t1.put(63,"Deeplearn");
		t1.put(2,"machine");
		t1.put(46,"wow");
		t1.put(5,"brawo");

		System.out.println(t1); // {1=ranjith, 2=machine, 5=brawo, 7=dot, 46=wow, 55=ranjith, 63=Deeplearn}

		// ** subMap() **//
		SortedMap<Integer,String> s1 = t1.subMap(1,46);
		 TreeMap<Integer,String> t2 = new TreeMap<Integer,String>(s1);
		 System.out.println(t2); 						// {1=ranjith, 2=machine, 5=brawo, 7=dot}

		 // ** tailMap() **//
		SortedMap<Integer,String> s2 = t1.tailMap(5);
		 TreeMap<Integer,String> t3 = new TreeMap<Integer,String>(s2);
		 System.out.println(t3); 					// {5=brawo, 7=dot, 46=wow, 55=ranjith, 63=Deeplearn}

		 // ** headMap() **//
		SortedMap<Integer,String> s3 = t1.headMap(5);
		 TreeMap<Integer,String> t4 = new TreeMap<Integer,String>(s3);
		 System.out.println(t4); 					// {1=ranjith, 2=machine}
	}
}							

