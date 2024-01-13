#throw

throw is mainly used for to create user defined exception 

so to create user defined exception there are two setps :

	1.) create exception class 

	2.) use that exception in your project


 	## 2 types of user exception :
 ---------------------------------

 		1.) user checked exception :
 		```java

 			class Myexception extends Exception  <-- see here carefully
 			{

 		}
   ```
 	         also it has 2 types  :

 		  			1.) 0 - arg constructor approach
 		  			1.) parametarised  constructor approach



 		 2.) user un-checked exception : (check what type it is using video)
 		```java

 			class Myexception extends RuntimeException <-- see here carefully
 			{

 		}
	```
 		  also it has 2 types  :

 		  			1.) 0 - arg constructor approach
 		  			1.) parametarised  constructor approach

  
  in 0 - arg constructor approach :

  		it simply print the exception

  in parametarised constructor approach :

  		it print the exception with exception message (like : / by zero )


checked exception -> you must handle using try-catch or throws

un-checked exception -> no need to handle but it is better to handle 

 ex 1:  (checked exception 0 arg cons)

 ex 2 : (un-checked exception 0 arg cons)

 ex 3:  (checked exception parametarised  cons)

 ex 4 : (un-checked exception parametarised  cons)


 so throw key word is only used to pass the user defined Exception's

 we can modify the default Exeception's message using throw see ex5.java


