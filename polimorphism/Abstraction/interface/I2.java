interface I2{   // by default anstract
	int a = 10; // by defaultpublic static final
	void m1();  // by default public abtract 
}
class A2 implements I2{
	public void m1(){
		//I2.a = I2.a+20;  // we can't change the value bcoz it final variable
		System.out.println(I2.a+"m1 method");  // you can access the method
	}
	public static void main(String[] args) {
		A2 n = new A2();
		n.m1();
	}
}

// after this see I4.java