/*
							here progarm shows how to remove data based on key's

*/


package com.dss;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

class Test{
	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> lh = new LinkedHashMap<Integer, Product>();
		lh.put(1,new Product(111,"ranjith"));
		lh.put(7,new Product(46,"dot"));
		lh.put(555,new Product(746,"doc"));


		System.out.println("Before Delete: ");
		for(Entry<Integer, Product> pro : lh.entrySet()){
			Integer i = pro.getKey();
			Product p = pro.getValue();
			System.out.println("Integer : "+i);
			System.out.println("product :  id : "+p.id+" name: "+p.name);
		}

		// get entry
		Set<Entry<Integer, Product>> en = lh.entrySet();
		Iterator<Entry<Integer, Product>> i = en.iterator();
		i.add(2,new Product(2,"new_one"));
		while(i.hasNext()){
			Entry<Integer, Product> ee = i.next();
			Integer in = ee.getKey();
			Product pp = ee.getValue();
			if(pp.id==746)
				i.remove();
			if(in == 7)
				i.remove();
		}

		// remining
		System.out.println("After Delete: ");
		Set<Entry<Integer, Product>> ent = lh.entrySet();
		Iterator<Entry<Integer, Product>> i2 = ent.iterator(); // we are iterating the Set class not Map.
		while(i2.hasNext()){
			Entry<Integer, Product> ee2 = i2.next();
			Integer in2 = ee2.getKey();
			Product pp2 = ee2.getValue();
			System.out.println("Integer : "+in2);
			System.out.println("product :  id : "+pp2.id+" name: "+pp2.name);
		}
	}
}