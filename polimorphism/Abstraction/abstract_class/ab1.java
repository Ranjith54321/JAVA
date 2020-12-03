// abstract class object creation is not possible
abstract class ab1{
	void m1(){
		System.out.println("this is abstract class normal method");
	}
	abstract void m2();
	abstract void m3();
}
class A1 extends ab1{ // if you not declare m2 or m1 here this class is still abstract class bcoz it contains un implemented abstact method 
	void m2(){					// so object creation is not possible
		System.out.println("m2 method");
	}
	void m3(){
		System.out.println("m3 method");
	}
	public static void main(String[] args){
		A1 a = new A1();
		a.m1();
		a.m2();
		a.m3();
	}
}