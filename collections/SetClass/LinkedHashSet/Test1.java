/*  
										LinkedHashSet
						  public java.util.LinkedHashSet(int, float);
						  public java.util.LinkedHashSet(int);
						  public java.util.LinkedHashSet();
						  public java.util.LinkedHashSet(java.util.Collection<? extends E>);
						  public java.util.Spliterator<E> spliterator();  -> 5th not yet expplained see on net

						  constructors are same as in HashSet 
							
							1  public java.util.HashSet(); ->normal 
												load factor -> memory representation
							      inital capacity -> 16 load factor -> 0.75
								  load factor range 0.0 to 1.0

							2  public java.util.HashSet(int);
									initial capacity

							3 public java.util.HashSet(int, float);
							      initial capacity and load factor

							4  public java.util.HashSet(java.util.Collection<? extends 
			*/



package com.dss;
import java.util.LinkedHashSet;
import java.util.Iterator;
class Test1{
	public static void main(String[] args) {
		LinkedHashSet<Emp> lh = new LinkedHashSet<Emp>();
		lh.add(new Emp(1,"doc"));
		lh.add(new Emp(2,"dot"));
		lh.add(new Emp(39,"abc"));
		lh.add(new Emp(444,"ranjith"));

		Iterator<Emp> i = lh.iterator(); // negeric
		while(i.hasNext()){
			Emp e = i.next();
			if(e.id==1)
				i.remove();
			if(e.name.equals("abc"))
				i.remove();
		}
		for(Emp e : lh){
			System.out.println(e.id+" "+e.name);
		}
	}
}