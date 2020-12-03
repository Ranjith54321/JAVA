package com.dss;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
class Test{
	public static void main(String[] args) {
		Vector<Product> p = new Vector<Product>();
		p.add(new Product("RS200",150000));
		p.add(new Product("Dominar",180000));
		p.add(new Product("Duke_250",250000));

		// using Enumeration
		Enumeration<Product> e = p.elements();
		while(e.hasMoreElements()){
			Product pp = e.nextElement();
			System.out.println(pp.name+" "+pp.price);
		}
		System.out.println();

		// using iterator
		Iterator<Product> i = p.iterator();
		while(i.hasNext()){
			Product pp = i.next();
			System.out.println(pp.name+" "+pp.price);
		}
		System.out.println();

		// using ListIterator // Vector also in list class so it supports all cursors
		ListIterator<Product> li = p.listIterator();
		while(li.hasNext()){
			Product pp = li.next();
			System.out.println(pp.name+" "+pp.price);
		}

	}
}