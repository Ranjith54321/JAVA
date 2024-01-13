// abstract class object creation is not possible
abstract class ab2{
	void m1(){
		System.out.println("this is abstract class normal method");
	}
	abstract void m2();
	abstract void m3();
	abstract void m4();
}
abstract class A2 extends ab2{ // if you not declare m2 or m1 here this class is still abstract class bcoz it contains un implemented abstact method 
	void m2(){					// so object creation is not possible
		System.out.println("m2 method from A2");
	}
	void m3(){
		System.out.println("m3 method");
	}
}
class B2 extends A2{
	void m2(){					
		System.out.println("m2 method");
	}
	void m4(){
		System.out.println("m4 method");
	}
	public static void main(String[] args){
		//A2 b = new A2(); //  object creation is not possible
		//b.m1();
		B2 a = new B2();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}