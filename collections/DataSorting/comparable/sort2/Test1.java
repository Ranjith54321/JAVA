/*
			Implement comparable for emp data

			so to implement comparable it satisfy
			1.) Homogenious data
			2.) it should implement Comparable interface [here you need to implement it ]
					String and wrapper classes are defaultly implemented that class but it is user defined class

			here comparision is not stable we should change code based in the type of the data 

			-----> we need to manually implement the compareTo() method
*/
// here we going to compare integer data 
package com.dss;
import java.util.ArrayList;
import java.util.Collections;
class Test1{
	public static void main(String[] args) {
		ArrayList<Emp> l = new ArrayList<Emp>();
		l.add(new Emp(222,"ranjith"));
		l.add(new Emp(999,"askl"));
		l.add(new Emp(2,"zack"));
		l.add(new Emp(92,"doc"));

		Collections.sort(l);// this will going to check wherther cpmpareTo method is available in the Userdefined class or not

		for(Emp e : l){
			System.out.println(e.id+" "+e.name);
		}
	}
}


// now if you want to sort the obj bsed on name then you need to change the entire code in Emp class
			// so so goo ther and see



/*
			based on id (int)
			F:\java\collections\DataSorting\sort2>javac -d . Emp.java

			F:\java\collections\DataSorting\sort2>javac -d . Test1.java

			F:\java\collections\DataSorting\sort2>java com.dss.Test1
			2 zack
			92 doc
			222 ranjith
			999 askl
*/






/*
		2. base on name

		F:\java\collections\DataSorting\sort2>javac -d . Emp.java

		F:\java\collections\DataSorting\sort2>javac -d . Test1.java

		F:\java\collections\DataSorting\sort2>java com.dss.Test1
		999 askl
		92 doc
		222 ranjith
	    2 zack

*/


/*
		limitations

		1.) we are mixing sorting logics and business in single class
		2.) one property sorting is possible at one time 
				otherwise you need to modify the class based in the type



*/