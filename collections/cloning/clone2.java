/*
			all collection classes support cloing and seriazlization

			here we see colning on colllection 

			it simply copy the data from thr heap memory so the time will be saved

			colne() method returns object so you need to  type caste it

*/
import java.util.ArrayList;
class clone{ // collection classes defaultly implemrnts Colnable and seriazlization intefaces no need to implment
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ranjith");
		l1.add("hike");
		l1.add("byke");
		l1.add("classification");

		System.out.println(l1);

		// now clone
		ArrayList<String> l2 = (ArrayList<String>)l1.clone(); // convert normal obj to ArrayList obj

		System.out.println(l2);


	}
}

// like wise you can do set classes alo