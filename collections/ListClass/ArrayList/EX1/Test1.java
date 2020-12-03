package com.dss;

import java.util.ArrayList;
public class Test1{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("string");;
		a.add(null);
		a.add(new Student(1,"ranjith_dot"));
		a.add(new Emp(10,"dot_bahi"));

		System.out.println("with out type casting : ");

		System.out.println(a);  // with out type casting the user definde object i,e except wrapper class 
										// others are not in a proper way you can see in the op screen  

										// o/p :  --> [10, string, null, com.dss.Student@5c8da962, com.dss.Emp@512ddf17]

		
		// so use for each loop
		System.out.println("After type casting : ");
		for(Object o : a){  // here we use Object class to hold the obj data bcoz obj class can store all type of obj
			if(o instanceof Student){
				Student s = (Student)o; // type caste the Arraylist obj to student object 
				System.out.println(s.no+" "+s.name);
			}
			if(o instanceof Emp){
				Emp e = (Emp)o;   
				System.out.println(e.no+" "+e.name);
			}
			if(o instanceof String){
				System.out.println(o); // here auto unboxing will heapen
			}
			if(o instanceof Integer){
				System.out.println(o); // premitive data types , string, string-buffer auto unboxing will heappen
			}
			if(o == null){ // here not **** note-> (o instanceof null)
				System.out.println(o);
			}
		}

		// seeee here ....
		System.out.println("0th index : "+a.get(0)); // we can access using particular index as well

		// this is not good aproach while we having hetrogenious obj bcoz we don't know what type of obj is in 75th location (if 1000 data)
		// so you should perform type checking and then type casting (above for loop) 
	}
}

/*
	from above we can say 

	1.) arrays are type safe 
		bcoz it contains only homogenious data so no need to type caste or something

	2.) collection's are not type safe

		as you can see above we should type cate the obj to another type then only we can make it usable

		so we need to perform : 
		--> 1. type checking  // instanceOf
		--> 2. type casting  // Emp e = (Emp)o;


		----- > so to overcome this problem prividing type safe to the collectons we implwment "generics"



*/