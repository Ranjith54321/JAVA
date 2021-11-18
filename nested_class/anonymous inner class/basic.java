/*
anaonymous inner class :

	nameless inner class in java is called anonymous inner class
	
it basically over rides the repeated method inthe class 

without anaonymous class  :

*/
/*class A{
	void m1(){}
	void m2(){}
}
class B extends A{
	void m1(){ System.out.println("m1 method");}
	void m2(){ System.out.println("m2 method");}
}
class client{
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		// here this client class needs these two methods
	}
}*/
/*
	output :

	m1 method
	m2 method
*/
// now we apply anonymous inner class 
// here we should over ride then only it is possible to create anonymous inner class
class A{
	void m1(){}
	void m2(){}
} 
class client{
	A a = new A(){
		void m1(){ System.out.println("m1 method unsing anonymous iner class");}
		void m2(){ System.out.println("m2 method unsing anonymous iner class");
		System.out.println(a.getClass().getName());}

	}; // here ';' is mandotary
	public static void main(String[] args) {
		client c = new client();
		c.a.m1();
		c.a.m2();
	}
} 

/*
	output :

	mm1 method unsing anonymous iner class
	m2 method unsing anonymous iner class
	client$1 // that 1 is internally created class

*/
	see test4.java watched nareshIT video you can see this also...... aslo watch telusko video