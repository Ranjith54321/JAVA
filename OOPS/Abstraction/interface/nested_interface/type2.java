class Z{
	interface I2{
		void m1();
	}
}
class B implements Z.I2{   // note here use implements
	public void m1(){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		new B().m1();
	}
}