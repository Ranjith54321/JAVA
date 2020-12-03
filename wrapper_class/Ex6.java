/*
   AutoBoxing and Auto-Unboxing

   1.) Auto-boxing:
   		Automatic convertion of String or premtive data to wrapper object

   2.) Auto-Unboxing :
    	wrapper obect to premitive





*/

class Ex6{
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);// without Auto-boxing
		Integer i2 = 20; // Autoboxing

		int x = i1.intValue();
		int x2 = new Integer(30);
		int z = i2; // it is also possible

		System.out.println("i1 : "+i1);
		System.out.println("i2 : "+i2);

		System.out.println("x : "+x);
		System.out.println("x2 : "+x2);
		System.out.println("z : "+z);
	}
}

// see ex6.1 why Auto boxing is important 