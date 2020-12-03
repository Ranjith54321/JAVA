/*
				
*/
package com.dss;
import java.util.LinkedList;
import java.util.Collections;
class Test1{
	public static void main(String[] args) {
		LinkedList<Emp> l = new LinkedList<Emp>();
		l.add(new Emp(13,"bag",1500));
		l.add(new Emp(65,"can",100));
		l.add(new Emp(05,"phone",100000));
		l.add(new Emp(999,"car",1000005000));

		// sort asscending order items based on id using comparable
		Collections.sort(l);
		for(Emp e : l){
			System.out.println(e.id+" "+e.name+" "+e.price);
		}

		// sort desscending order items based on id using comparator
	}
}