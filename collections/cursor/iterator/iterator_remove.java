package com.dss;
import java.util.ArrayList;
import java.util.Iterator;
class IT{
	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp(111,"ranjith"));
		emp.add(new Emp(222,"dot"));
		emp.add(new Emp(333,"mmm"));
		emp.add(new Emp(46,"doc"));

		System.out.println("ArrayList : "+emp); // we need to convert it 

		Iterator<Emp> i = emp.iterator(); // see here carefully for user dedined class we make convertion here
		while(i.hasNext()){
			Emp e = i.next();                // so no need to convert here
			if(e.id == 222)
				i.remove();
			if(e.name.equals("mmm"))
				i.remove(); 
		}

		System.out.println("after remove");
		for(Emp ee : emp){
			System.out.println(ee.id+" "+ee.name);
		}
	}
}