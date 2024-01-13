/*           parent reference variable:

1.)  parent p = new parent();  // possible
	 child c = new child();    // possible
	 parent p = new child();   // possible  *** parent reference variable stores the child class object ***
	 child c = new parent(); // not possible

*/

class parent5{
	void m1(){
		System.out.println("parent  m1 method");
	}
}	 
class child5 extends parent5{
	void m1(){
		System.out.println("child m1 method");
	}
	void m2(){
		System.out.println("child m2 method");
	}
	public static void main(String[] args){
		parent5 p = new child5();
		p.m1();  // compile time --> it check m1 method in parent class runtime-> execute child class
		//p.m2();  // compile time it check m2 method in parent class it is not available so it shows error [Important**]

		     // parent reference variable excecute when the methods are available on the both the classes

		// so to access with the help of parent reference avriable type caste it

		child5 c = (child5)p; // type caste the object then access the m2 method
		c.m2();

	}
}