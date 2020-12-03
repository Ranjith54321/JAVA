class Ex3{
	public static void main(String[] args) {
		int a = 10;
		float f = 20.12f;
		int b = 30;
												// *********commented are not work just i tired *********
		// 1.) premitive to wrapper class
		Integer i1 = new Integer(a);
		System.out.println("ID : "+(i1+a)); 
		Float f1 = new Float(f);
		//String s1 = new String(b);
		double d1 = new Double(b);

		//2.) wrapper to premitive
		int a1 = i1.intValue();
		//float f11= d1.floatValue();
		//int b1 = d1.intValue();

		//3.)  string to premitive
		String str = "1000";
		int ip = Integer.parseInt(str);
		float fp = Float.parseFloat(str);

		//4.) premitive to string obj
		//String s1 = new String(a);
		String s2 = String.valueOf(b);
		//String s3 = f.toString();

		// 5.) string value to warpper obj // note here string value not string obj
		Integer i2 = new Integer(str);
		//Integer i2 = new Integer(s2); // trial

		System.out.println(i2+3);

		// 6..) wrapper obj to string obj
		String s3 = i2.toString();
		//String s4 = new String(i1); // not work

	}
}