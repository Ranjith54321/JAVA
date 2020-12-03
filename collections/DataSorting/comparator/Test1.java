/*
											COMPARATOR

			1.) comparator is only used for user defined class obj data sorting

			2.) but in comparable you can sort wrapper class and user defined class but it looks dificult for user defined class

			3.) here we implement sorting logics in separate class  you can write n-no of sorting logics no problem 

			4.) it's comes under java.util package but comparable is java.lang package

			5.) this interafce containce *** compare() method *****

			6.) you should call from collections class bcoz colletions class only contans comparator interface so pass it *** through sort() mrthod**

*/
package com.dss;
import java.util.ArrayList;
import java.util.Collections;
public class Test1{
	public static void main(String[] args) {
		ArrayList<Emp> l = new ArrayList<Emp>();
		l.add(new Emp(222,"ranjith"));
		l.add(new Emp(999,"dot"));
		l.add(new Emp(19,"vlm"));
		l.add(new Emp(23,"abc"));

		// sort based on id this hase separete class

		Collections.sort(l,new Idcom()); // here you need to pass list(collection class) and sorting class

		for(Emp e : l){
			System.out.println(e.id+" "+e.name);
		}

		// sort based on name 
		Collections.sort(l,new Namecom());
		for(Emp e : l){
			System.out.println(e.id+" "+e.name);
		}
	}
}