import java.util.ArrayList;
import java.util.Arrays;
class Af{
	public static void main(String[] args) {
		//1. convert array to ArrayList
		String[] s = {"ranjith","dot","46"};
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s)); // here convertion
		a1.add("abc");
		a1.add("xyz");

		System.out.println(a1);

		//2. to convert generics collections to array
		 ArrayList<String> a2 = new ArrayList<String>();
		 a2.add("askl");
		 a2.add("NS");
		 String[] s1 = new String[a2.size()];
		 a2.toArray(s1); // here convertion
		 //s1 = a2.toArray();  this will not work bcoz it is generics
		 for(String ss : s1){
		 	System.out.println(ss);
		 }
     	
         // convertion of normal collections (mixed objects) to array
         ArrayList a3 = new ArrayList();
         a3.add("RS");
         a3.add("200");
         Object[] o = new Object[a3.size()];
         o = a3.toArray();
         //Object[] 0 = a3.toArray(); // another approach
         for(Object oo : o){
         	System.out.println(oo); // here Auto-unboxing will hrappen
         								// if we pass emp or struct class you should tyoe cate it
         }

         // here we have Object array and then add to that object array bcoz array only supports homogenious data type
	}
}