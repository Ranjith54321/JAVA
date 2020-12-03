interface I4{
	int a = 10;
	void m1();
}
interface I5{
	int a = 50;
}

class A4 implements I4,I5{
	public void m1(){
		System.out.println("I4 a = "+I4.a+"   I5 a = "+I5.a);
	}
	public static void main(String[] args) {
		A4 a = new A4();
		a.m1();
	}
}