
											   Map (I)    (root interface) // Map is root interface
							(implements)      /  \   
											 /    \    (extends)
								     HashMap (C)  SortedMap (I)
							  (extends)    /		\
									      /			 \    (extends)
								LinkedHashMap (C)    NavigableMap (I)
								     					\	
								    					 \   (implements)
														TreeMap	(C)


						Map contains  ( key,value ) pair *****
---------------------------------------------------------------------------
see the introduction in the java by ratan book pg : 317

	-> from 1.2 vrsion

	-> Hetrogenious data allowed

	-> null values allowed but key one time null  for value any no of time  null

	-> methods are nonsynchronized (bcoz 1.2 )

	-> uderlying datastructures : hashTable

	-> keys must be unique value may be duplicate

	-> to get only key  use keySet() method it's' return type Set 

	-> to get only  value use values() method it's' return type Colllection

	-> (key,value) -> is called entry

	-> to get (key,value) pair use entrySet() method  it's' return type Set 

	-> it does not support cursors***



