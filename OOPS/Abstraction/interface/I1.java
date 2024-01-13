// inter face is pure abstract class it contains only method declarations the implementations are in child classes
// iterface is pure abstract class ,,   
// methods are  public abstract 
// variables are public static final
interface I1{
	void m1();
	void m2();
	void m3();
}
class A1 implements I1{
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
	}
	public void m3(){
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		A1 a = new A1();
		a.m1();
		a.m2();
		a.m3();
		System.out.println("this is using parent reference vaiable");
		I1 i = new A1();
		i.m1();
		i.m2();
		i.m3();
	}
}