/*
	== (operator)  and   equals() (method) 

	==    -> always reference comparission

	equals()  -> always content comparission

*/ 

class Ex7{
	public static void main(String[] args) {
		// eg : 1
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		System.out.println("using new with ==     "+(i1==i2));  //false
		System.out.println("using new with equals "+(i1.equals(i2))); // true


      // eg :2 
		Integer x1 = Integer.valueOf(200);
		Integer x2 = Integer.valueOf(200);

		System.out.println("using valueOf with ==      "+(x1==x2));  // ref comparission    // false
		System.out.println("using valueOf with equals  "+(x1.equals(x2))); // content comparission //true


		// eg: 3 ///////////////////////////note //////////////
		// valueOf method will always cache values in the range -128 to 127
		//  i,e -128 to 127 ranged values are refernce to the same object   
		Integer z1 = Integer.valueOf(20);
		Integer z2 = Integer.valueOf(20);  // if you put 25 of different from z1 it shows fals for == operator

		System.out.println("immmmmmporatntusing valueOf with ==    "+(z1==z2));  // ref comparission  //true
		System.out.println("using valueOf with equals               "+(z1.equals(z2))); // content comparission // true

	}
}

// last topic factory method see it on the pdf