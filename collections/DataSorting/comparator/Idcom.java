package com.dss;
import java.util.Comparator;
public class Idcom implements Comparator{ // this is not generic so compare contains Object formate
	public int compare(Object o1,Object o2){ // here we get Object formate only 
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;

		if(e1.id==e2.id)
			return 0;
		else if(e1.id>e2.id)
			return 1;
		else
			return -1;

	}
}