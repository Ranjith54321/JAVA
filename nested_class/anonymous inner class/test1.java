/*
if you use anonymous inner class inside the main method no need to  create obj for the main class

*/

abstract class A {
    void m1(){}
    void m2(){}
}

class client2{
	public static void main(String[] args) {
		A a = new A(){ // It seems like it is replacing the Adaptor class usage.
			void m1(){System.out.println("this is display method");} // If the A is abtract or interface all the abtract methods must be imeplemnted.
		};
		a.m1();
	}
}

/*
	output :

	this is display method
*/

// => it internally creates the A class 


// Using Interface:

interface A {
    void m1(){}
    void m2(){}
}

class client2{
	public static void main(String[] args) {
		A a = new A(){ // Should implement all the methods else we wil face error. And Public access modifier also important.
			public void m1(){System.out.println("this is display method");} // If the A is abtract or interface all the abtract methods must be imeplemnted.
		};
		a.m1();
	}
}

// This will give error.