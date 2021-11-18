here we only see the difference between them : 

							comparable                              |                    comparator
	-------------------------------------------------------------------------------------------------------------------------------------------																
		1.) package : java.lang                                     |     1.) package : java.util
																	|	
		2.) by using this we can easily sort String and wrapper     |     2.) this is only for user defined class
				classes also we can sort user defined class         |
				  but bit dificult 									|			
				  													|
		3.) it is mixing, sorting logics and business logics        |     3.) here we define sorting logics in a separate class so we can implement 
																	|			when we need 
																	|
		4.) only one property sorting bocz you need to modify in    |     4.) here multiple sorting is possible implement when it needs
				user defined class every time						|
																	|
		5.) sorting  logic :										|	  5.) sorting ologic :
 			 comparable interface contain compareTo() method        |               comparator interface contain compare() method
 			 you should override that it needs one obj 				|		   	   you should override that it needs two obj 
 			 														|
 		6.) Colletions.sort(e) (here you pass one arg obj)          |     6.)  Colletions.sort(obj,new sortclass()) (here pass obj and create sortclass obj to class)
																	|	


			      7.) compareTo() and compare() both are abstract method's we only need to write logics for this mthods while sorting user defined class