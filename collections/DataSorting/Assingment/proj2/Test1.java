package com.dss;
import java.util.LinkedList;
import java.util.Collections;
class Test1{
	public static void main(String[] args) {
		LinkedList<Product> l = new LinkedList<Product>();
		l.add(new Product(13,"bag",1500));
		l.add(new Product(65,"can",100));
		l.add(new Product(05,"phone",100000));
		l.add(new Product(999,"car",1000005000));

		// sort asscending order items based on id using comparator
		System.out.println("bsed on id");
		Collections.sort(l,new Idcom());
		for(Product e : l){
			System.out.println(e.id+" "+e.name+" "+e.price);
		}

		// sort desscending order items based on name using comparator
		System.out.println("bsed on name");
		Collections.sort(l,new Namecom());
		for(Product e : l){
			System.out.println(e.id+" "+e.name+" "+e.price);
		}
	}
}