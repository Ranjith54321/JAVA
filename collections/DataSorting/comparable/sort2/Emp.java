package com.dss;
//public class Emp implements Comparable{
public class Emp implements Comparable<Emp>{ // use this when you compare string on user defined class 
	int id;
	String name;
	Emp(int id,String name){
		this.id = id;
		this.name = name;
	}

	/*public int compareTo(Object o){     // for int use this class formate /// public class Emp implements Comparable
		Emp e = (Emp)o;
		if(id==e.id)
			return 0;
		if(id>e.id)
			return 1;
		else
			return -1;
	}*/

	public int compareTo(Emp e){ // so now it directly get Emp obj that's why we generic the class above
			return name.compareTo(e.name);
	}
}





