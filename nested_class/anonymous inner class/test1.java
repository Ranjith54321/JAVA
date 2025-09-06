/*
if you use anonymous inner class inside the main method no need to  create obj for the main class

*/

abstract class A {
    void m1(){}
    void m2(){}
}

class client2{
	public static void main(String[] args) {
		A a = new A(){
			void m1(){System.out.println("this is display method");} // If the A is abtract or interface all the abtract methods must be imeplemnted.
		};
		a.m1();
	}
}

/*
	output :

	this is display method
*/

	// it internally creates the A class 