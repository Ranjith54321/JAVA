package com.dss;
import java.io.Serializable; // this is emp data so we need to import it but collections it is default
public class Emp implements Serializable{ // this class should implements Serializable interface bcoz this is going to be accesed
	int id;
	String name; 
	transient String pass;// this is producted from other jvm's only default values will be visible for the other jvm's
	Emp(int id,String name,String pass){
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
}