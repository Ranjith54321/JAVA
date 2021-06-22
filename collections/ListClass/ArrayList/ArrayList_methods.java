/*
		ArrayList methods

		1.) add()	  --> add the obj to ArrayList

		2.) remove()  --> by defalut it take index value  you can pass obj also
		3.) set()     -->  to replace the obj
		4.) clear()	  --> to make epmty the ArrayList
		5.) isEmpty() --> to chech the ArrayList is empty
		6.) size()    --> to find the size of the ArrayList

			// for more see below
*/
import java.util.ArrayList;
class Ab{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// 1.) add 
		a.add(10);
		a.add("ranjith");
		a.add(10.2);
		a.add(2,46);     // you can you like this
		a.add(3,"dot");   
		a.add("doc");

		System.out.println(a);


		//2.) remove
		  // by default it take indexvalue you can pass obj also
		// if index value is larger than the size then it shows index out of bound exception
		// if you pass obj if it is not availale it won't cause any error
		a.remove("10"); // obj  this can't recognize
		a.remove("dot"); // obj
		a.remove(1); // index

		System.out.println(a);

		// 3. set() method to modify the obj set( index_value, new_obj ) ****** set only allow index and new obj name*****
		a.set(1,"set1");
		//a.set("dco","monk");  we can't dot this   ***

		System.out.println(a);

		// clear()  it just remove all the obj's from the list
		a.clear();

		System.out.println(a);

		System.out.println("size : "+a.size());

		System.out.println("ArrayList is empty :"+a.isEmpty());

	}
}