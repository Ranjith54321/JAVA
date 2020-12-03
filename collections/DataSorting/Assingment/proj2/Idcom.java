package com.dss;
import java.util.Comparator;  // it is mantatory to import but in comparable not neccesary
public class Idcom implements Comparator<Product>{
		public int compare(Product p1,Product p2){
			if(p1.id==p2.id)
				return 0;
			else if(p1.id>p2.id) // dor desscending order just put < [i.e -> p1.id<p2.id] that's it
				return 1;
			else
				return -1;
		}
}