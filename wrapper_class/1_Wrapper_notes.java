        ----------------Wrapper class -------------  (--- for more you can see java by ratan pdf  -----)
        comes uder java.lang package     

---> there are 8 data types in java 
---> in collection everything in the form of objects or collection only supports objects
---> so,to represent premetive data types in the from of objects we use wrapper class

data type:
	byte
	short
	int 
	long
	float
	double
	char
	boolean

why we convert in to Object formate:
  
      bcoz:   collection f/w supports : 1. only Object data
      									2. serialization
      									3. cloneing Process
      									4. Object data allow null value
      									5. Object can convert to toString()




						      	  Object class (parent)
						        |              |                |
  (child class of Object ) 1. Character   2. boolean        3.Number  

  															1. byte     (these are child class of Number)
  															2. short
  															3. int
  															4. long
  															5. float
  															6. double   
  	-->  Character and boolean only direct children of object class


  	2 ways to create wrapper object 
-----------------------------------------
1. constructor approach
2. valueOf() method : static

1.) constructor approach   [-------  premetive or String -----> wrapper Object
-------------

Integer i1 = new Integer(10);
Integer i2 = new Integer("10");


Float f1 = new Float(10.50); // double
Float f2 = new Float(10.5f);         float onlysupports there approaches
Float f3 = new Float("10");


Character c1 = new Character('c');   see Java by ratan pdf notes


2. valueOf() method : static  [-------  premetive or String -----> wrapper Object

Integer i1 = Integer.valueOf(10);
Integer i2 = Integer.valueOf("10");

Float f1 = Float.valueOf(10.5);  // double
Float f2 = Float.valueOf("10.5");  
Float f3 = Float.valueOf(10.5f);


Character g = Character.valueOf('v');

---------------------------------------
  ---> not like this use Error
Integer i1 = new Integer("ten");   java.lang.NumberFormatException
Integer i1 = Integer.valueOf("one");  java.lang.NumberFormatException