abstract class ab3{
	int a = 100; // variable is instance variable                           //1.) variables
	ab3(){																	// 2.) consatructor
		System.out.println("this is abstract parent class constructor");
	}
	{																		// 3.) instance block
		System.out.println("this is abstract parent class instance block");
	}
	static{																	// 4.) static block
		System.out.println("this is abstract parent static block");
	}
	abstract void m1();														// 5.) methods
}
class A3 extends ab3{
	void m1(){
		super.a = super.a+20;
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		ab3 n = new A3();         // parent refernce variable // it possible only when overriding
		n.m1();

	}
}
/*
 
O/P:

this is abstract parent static block
this is abstract parent class instance block
this is abstract parent class constructor
120


 */