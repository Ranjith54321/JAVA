// marker interface doen't contain any method , (empty class how provide functionality? )
			   //it provides some fucntionality that are given by JVM 
class A implements Cloneable{  // cloneable is the one of the inbuild interface 
									// here it is used to clone the object i.e,  we back-up the object
	int a = 111;
	int b = 555;
	public static void main(String[] args) throws Exception {
		A q = new A();
		System.out.println("a = "+q.a);
		System.out.println("a = "+q.b);
		q.a = 1100;
		q.b = 2200;
		A h = (A)q.clone();
		System.out.println("a = "+q.a);
		System.out.println("a = "+q.b);
		q.a = 999;
		q.b = 888;
		System.out.println("a = "+q.a);
		System.out.println("a = "+q.b);

		// here i need 1100 and 2200
		System.out.println("a = "+h.a);
		System.out.println("a = "+h.b);


	}
}