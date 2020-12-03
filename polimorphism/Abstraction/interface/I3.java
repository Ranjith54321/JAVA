interface I3{
	void m1();
	void m2();
	void m3();
	void m4();
}
abstract class A3 implements I3{
	public void m1(){
		System.out.println("m1 method");
	}
}
abstract class B1 extends A3{
	public void m2(){
		System.out.println("m2 method");
	}
	public void m3(){
		System.out.println("m3 method");
	}
}
class C1 extends B1{
	public void m4(){
		System.out.println("m4 method");
	}
	public static void main(String[] args) {
		C1 c = new C1();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println("parent reference variable");

		B1 i = new C1();
		i.m1();
		i.m2();
		i.m3();
		i.m4();
	}
}