package com.dss;
import java.util.Comparator;

public class Namecom implements Comparator<Emp>{ // this is generics that why compare method comtains Emp obj
	public int compare(Emp e1, Emp e2){
		return e1.name.compareTo(e2.name);
	}
}