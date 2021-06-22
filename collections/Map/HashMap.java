/*
					HashMap

					-> from 1.2 vrsion

	-> Hetrogenious data allowed

	-> null values allowed but key one time null  for value any no of time  null

	-> methods are non-synchronized (bcoz 1.2 )

	-> uderlying datastructures : hashTable

	-> keys must be unique value may be duplicate

	-> to get only key  use keySet() method it's' return type is Set 

	-> to get only  value use values() method it's' return type is Collection

	-> (key,value) -> is called entry

	-> to get (key,value) pair use entrySet() method  it's' return type is Set 

	-> it does not support cursors***

	HashMap : insertion order not preserved   but  **********

						LinkedHashMap : insertion order is preserved   

			Constructors use java API document on browser

			Constructor and Description
				1.) HashMap()
					Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75). load fator range 0.0 to 1.0
				2.) HashMap(int initialCapacity)
					Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).
				3.) HashMap(int initialCapacity, float loadFactor)
					Constructs an empty HashMap with the specified initial capacity and load factor.
				4.) HashMap(Map<? extends K,? extends V> m)
					Constructs a new HashMap with the same mappings as the specified Map. 

					to add data use put() method
*/
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry; // many Entry are there we need Map.Entry


class hashmap{
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(11,"ranjith");
		h.put(561,"doc");
		h.put(177,"harly");
		h.put(999,"ns");			// order not preserved

		// get the key by using keySet() method return type is Set
		Set<Integer> s = h.keySet();
		System.out.println(s);

		// get the values by using values() method it's return type is Collection
		Collection<String> c = h.values();
		System.out.println(c);

		// get entries(nothing but key value pairs) by using entrySet() method return type is Set
		Set<Entry<Integer, String>> e = h.entrySet();  // here Entry is the interface here Etry contains two values  
		for(Entry<Integer, String> ee : e){					// so this entry is belongs to Map so tuned for key, value pair
			System.out.println(ee.getKey()+" "+ee.getValue());
		}
	}
}

  / -->  get(Object key)	This method returns the object that contains the value associated with the key.
/*
output : 
		[561, 177, 999, 11]

		[doc, harly, ns, ranjith]

		561 doc
		177 harly
		999 ns
		11 ranjith            // here you can see order not preserved ******


*/