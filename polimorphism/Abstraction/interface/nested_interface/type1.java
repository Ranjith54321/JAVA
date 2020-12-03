interface I1{
	interface I2{
		void m1();
	}
}
class A implements I1.I2{
	public void m1(){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		new A().m1();
	}
}