package com.dss;
import java.util.Comparator;  // it is mantatory to import  but in comparable not neccesary
public class Namecom implements Comparator<Product>{
	public int compare(Product p1,Product p2){
		return p1.name.compareTo(p2.name);
		// for dessceding order two types
		// 1.) return -p1.name.compareTo(p2.name);
		// 2.) return p2.name.compareTo(p1.name); // change the p1,and p2
 	}
}