package com.dss;
//import java.long.Comparable; // not needed but coparator it's needed // bcoz lang package is default package in java
public class Emp implements Comparable{
	int id;
	String name;
	float price;
	Emp(int id,String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int compareTo(Object o){
		Emp e = (Emp)o;
		if(e.id==id)
			return 0;
		else if(e.id<id)  // if you give -1 then desscending order  
			return 1;
		else
			return -1;
	}
}