/*
										TreeMap(Map<? extends K,? extends V> m)   -> 2nd constructor 

										adding one TreeMap data into another TreeMap

										using put()  and putAll()
*/
import java.util.TreeMap;
class treemap2{
	public static void main(String[] args) {
		TreeMap<String,Integer> t1 = new TreeMap<String,Integer>();
		t1.put("ranjith",33);
		t1.put("doc",46);
		t1.put("dot",55);

		TreeMap<String,Integer> t2 = new TreeMap<String,Integer>(t1);
		t2.put("t2",01);
		System.out.println(t2); // sorting based on keys (here String)

		TreeMap<String,Integer> t3 = new TreeMap<String,Integer>();
		t3.put("ranjith",33);
		t3.put("doc",46);
		

		TreeMap<String,Integer> t4 = new TreeMap<String,Integer>();
		t4.put("dot",55);

		TreeMap<String,Integer> t5 = new TreeMap<String,Integer>();
		t5.putAll(t3);
		t5.putAll(t4);
		t5.put("ranjith",333);
		t5.put("doc",4666);

		System.out.println(t5);  // here you can see duplicate keys are automatically removed
							// op : {doc=4666, dot=55, ranjith=333}    // also it concitrate on t5 latest class
	}
}									

