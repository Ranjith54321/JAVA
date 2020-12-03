/*
			here sort based on product id


*/
package com.dss;			
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map.Entry;
class Test{
	public static void main(String[] args) {
		TreeMap<Product,Cust> t1 = new TreeMap<Product,Cust>(new comp());
		t1.put(new Product(12,"NS"),new Cust(24,"ranjith"));
		t1.put(new Product(1,"RS"),new Cust(2,"dot"));
		t1.put(new Product(46,"domi"),new Cust(64,"mine"));
		t1.put(new Product(5,"AS"),new Cust(24,"beast"));

		for(Entry<Product,Cust> ee : t1.entrySet()){
			Product p = ee.getKey();
			Cust c = ee.getValue();
			System.out.println("product :  -> id : "+p.id+"   name : "+p.name);
			System.out.println("customer :  -> id : "+c.id+"   name : "+c.name);
		}
	}
}			
class comp implements Comparator<Product>{
	public int compare(Product p1,Product p2){
		//return -p1.id.compareTo(p2.id); // this not work bcooz it is int value not Integer
		if(p1.id==p2.id)
			return 0;
		else if(p1.id<p2.id)
			return 1;
		else
			return -1;
	}
}

// output :

/*			it is sorted desscedning order based ir Product id see carefully
	product :  -> id : 46   name : domi
	customer :  -> id : 64   name : mine
	product :  -> id : 12   name : NS
	customer :  -> id : 24   name : ranjith
	product :  -> id : 5   name : AS
	customer :  -> id : 24   name : beast
	product :  -> id : 1   name : RS
	customer :  -> id : 2   name : dot

*/