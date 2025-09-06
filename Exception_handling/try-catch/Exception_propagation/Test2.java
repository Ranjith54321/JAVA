class Test2{
	void m3(){
		System.out.println(10/0);
	}
	void m2(){
		m3();
	}
	void m1(){
		m2();
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
	}
}

op :

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test1.m3(Test2.java:3)
        at Test1.m2(Test2.java:6)
        at Test1.m1(Test2.java:9)
        at Test2.main(Test2.java:13)


      so jvm uses printStackTrace() method to display the Exeption