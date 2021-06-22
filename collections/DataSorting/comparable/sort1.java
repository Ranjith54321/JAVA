/*
			Collections Sorting

			to perform sorting in collections class it should satify the two condtions

			1.) it should Contain Homogenious data
			2.) it should implements comparable interface (collections class have that interface)

			important --->only String and all warpper classes implements camparble interface
					so only these classes use this 

		   comparable inteface has sort() method

		   		it internally has compareTo() method it compares two objc 

		   				eg : ranj and  abc  lets take first letter of both
		   				       
		   				       ran , ran return 0 --> nochange 
		   				       ran , abc return +ve value  --> need to swap
		   				       abc ,ran  retuns -ve value  --> no change


*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
class sort1{
	public static void main(String[] args) {
		//**//   			Type 1 				//**//
		ArrayList<String> s = new ArrayList<String>();    // String class
		s.add("ranjith");
		s.add("dot");
		s.add("abc");
		s.add("doc");
		s.add("46");

		System.out.println("Befor sort of ArrayList : "+s);
		Collections.sort(s);
		System.out.println("After sort of ArrayList : "+s);

		LinkedList<Integer> i = new LinkedList<Integer>();  // wrapper class
		i.add(999);  // here auto bxing is heapen --> Integer.valueOf(); [--> remember ]
		i.add(22);
		i.add(1);
		i.add(0);

		System.out.println("Befor sort of LinkedList : "+i);
		Collections.sort(i);
		System.out.println("After sort of LinkedList : "+i);

		//**//   			Type 2 				//**//
		// if you using hetrogenious obj's u get java.lang.ClassCastException:
		/*ArrayList s2 = new ArrayList();    // String class
		s2.add("ranjith");
		s2.add(10);																// hide this hole while run
		System.out.println("Befor sort of ArrayList : "+s2);
		Collections.sort(s2);*/

		//**//   			Type 3 				//**//
		// if you using null obj's normal obj's nad make comparision u get java.lang.NullPointerException
		/*ArrayList s3 = new ArrayList();    // String class
		s3.add("ranjith");													// hide this hole while run
		s3.add(null);
		System.out.println("Befor sort of ArrayList : "+s3);
		Collections.sort(s3);*/
	}
}