// toString()

  	/*
  	-> it is present in object class

  	-> it returns String representation of object [  i,e: class-name@hashcode ]
    
*/
class Ex5{
	public static void main(String[] args) {
		Ex5 a = new Ex5();
		System.out.println(a);
		System.out.println(a.toString());

		//o/p :
	/*	Ex5@5ccd43c2     hash code
		Ex5@5ccd43c2  */ 

		// string : internaly excecute toString() [string class over rides obeject class ] so it returns content of the object
		String s = "Ranjith";
		System.out.println(s);
		System.out.println(s.toString());  // it internally toString() heappens

		// StringBuffer : toString() [stringBuffer class over rides obeject class ] so it returns content of the object
		StringBuffer sb = new StringBuffer("Dot");
		System.out.println(sb);
		System.out.println(sb.toString()); // it internally toString() heappens

		//Wrapper classes : toString() : returns content of the object (here also overriding is heappens from objrct class)
		Integer i =new Integer(500);
		System.out.println(i);
		System.out.println(i.toString());    // it internally toString() heappens
	}
}


// you sholud not call the premitive variables using toString() if you try to call it is error