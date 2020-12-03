class Outer{
		static int a=10,b=20;
		static class Inner{
			void add(){ System.out.println(a+b);}
	}
	public static void main(String[] args) {
		new Outer.Inner().add();
		// here inner method is static so new key word is not reqired
	}
}

/*
	output :

	30
*/