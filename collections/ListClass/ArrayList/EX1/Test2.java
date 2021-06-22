/*
	-> if we use hetrogenioud arraylist ((or) collection)  this is not type safe we need to 
	    performe ->type check  and ->type caste
	-> also it not categorised so it make huge problem
	-> so to avoid this problem are we going with generics (it is nothing but specify the class type)
*/
package com.dss;
import java.util.ArrayList;
public class Test2{
	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();  // this is generics
		i.add(1);
		i.add(10);
		i.add(1000);  // here auto-boxig --> Integer.valueOf(1000);
		i.add(10000);
		for(Integer ii : i){  // here we have only Integer obj so directly use Integer class to access the ArrayList obj
			System.out.println(ii);
		}

		// now you can add emp data
		ArrayList<Emp> e = new ArrayList<Emp>();
		e.add(new Emp(1,"Ranjith"));
		e.add(new Emp(2,"Dot"));
		e.add(new Emp(3,"The_doc"));
		for(Emp ee : e){	// here we have only Emp obj so directly use Emp class to access the ArrayList obj
			System.out.println(ee.no+" "+ee.name);
		}

		// now you can add student data
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(5,"xyz"));
		s.add(new Student(10,"abc"));
		s.add(new Student(46,"doc_46"));

		for(Student ss : s){	// here we have only Student obj so directly use Student class to access the ArrayList obj
			System.out.println(ss.no+" "+ss.name);
		}
	}
}

// from here hide

*****notws ******   is you whant to run hide this 
so in collection : hetrogenious operations are not recommended 
					use generics to use homogenious data

 then we why we can't use array ? '
 	bcoz : collection has inbuild methods and good memory handing characteristocs but array don't'
