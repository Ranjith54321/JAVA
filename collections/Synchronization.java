						synchronization :

				def : the process of allowing only one thread at a time to complete the task entirely

		the class which are intoduced in 1.0 are synchronized  

			so here collection Vector only synchronized

			other List classes Set classes and Map are intoduced in 1.2 so they are not synchronized

			to make not synchronized in to synchronized Collections have some mthods 

			to know more see the java api on your browser for particular class

			some of them are :

				for ArrayList :
					List l = Collections.SynchronizedList(new ArrayList(...));

				for LinkedList :
					List l = Collections.SynchronizedList(new LinkedList(...));

				like wise see the Set and Map in Java api document in web

				see this link : https://stackoverflow.com/questions/21507858/what-is-the-difference-between-synchronized-and-non-synchronized-collection-clas
