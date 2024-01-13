// adatpter clss is npthing but empty implemention 
interface i6{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
	void m9();
	void m10();
}
class A6 implements i6{  // here implementation of a interface so no need to write all the methods
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
	public void m6(){}
	public void m7(){}
	public void m8(){}
	public void m9(){}
	public void m10(){}
}
class B6 extends A6{ // now you can implement what method you need
		public void m5(){
			System.out.println("m5 method ");
		}
	public static void main(String[] args) {
		B6 b = new B6();
		b.m5();
	}
}