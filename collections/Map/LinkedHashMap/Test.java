/*
							LinkedHashMap

				it is similar to HashMap but only difference is here insertion order is preserved

				here we going to use cursor for set***
*/
package com.dss;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

class Test{
	public static void main(String[] args) {
		LinkedHashMap<Emp,Student> lh = new LinkedHashMap<Emp, Student>();
		lh.put(new Emp(1,"ranjith"),new Student(1,"dot"));
		lh.put(new Emp(2,"Rs"),new Student(2,"race sport"));
		lh.put(new Emp(3,"Ns"),new Student(3,"nacked sport"));

		//get values
		Set<Emp> k = lh.keySet();
		// use cursor
		System.out.println("using cursor : (key)");
		Iterator<Emp> i = k.iterator();
		while(i.hasNext()){
			Emp ek = i.next();
			System.out.println(ek.id+" "+ek.name);
		}
		// you can do this using for each loop also so no need to create Set() so we can save space but this is only for display purpose
		System.out.println("using for each loop : (key)");
		for(Emp ee : lh.keySet()){
			System.out.println(ee.id+" "+ee.name);
		}

	//--------------------------------------------------------
		// get values
		Collection<Student> v = lh.values();
		// use cursor
		System.out.println("using cursor : (value)");
		Iterator<Student> i2 = v.iterator();
		while(i2.hasNext()){
			Student sv = i2.next();
			System.out.println(sv.id+" "+sv.name);
		}
		System.out.println("using for each loop : (vallue)");
		for(Student ss : lh.values()){
			System.out.println(ss.id+" "+ss.name);
		}


	//--------------------------------------------------------
		// get Entry
		System.out.println("using for cursor : (Entry)");
		Set<Entry<Emp,Student>> en = lh.entrySet();
		Iterator<Entry<Emp,Student>> i3 = en.iterator();
		while(i3.hasNext()){
			Entry<Emp,Student> sv = i3.next();
			Emp e1 = sv.getKey();
			Student s1 = sv.getValue();
			System.out.println(e1.id+" "+e1.name);
			System.out.println(s1.id+" "+s1.name);
		}

		System.out.println("using for each loop : (entry)");
		for(Entry<Emp,Student> eet : lh.entrySet()){
			Emp et = eet.getKey();
			Student st = eet.getValue();
			System.out.println(et.id+" "+et.name);
			System.out.println(st.id+" "+st.name);
		}
	}
}