/*
		we can display the exception masg in 3  ways :

			1.) using reference variable -> by default it calls toString()
			2.) getMessage() -> it will display only the msg
			3.) printStackTrace() -> it will display the flow



*/
class Test1{
	void m3(){
		try{
		System.out.println(10/0);}
		catch(ArithmeticException ae){
			System.out.println(ae); // internally ae.toString()
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
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

java.lang.ArithmeticException: / by zero --> (1)ref-variable

/ by zero                                --> (2) getMessage()

java.lang.ArithmeticException: / by zero --> (3) printStackTrace()
        at Test1.m3(Test1.java:14)
        at Test1.m2(Test1.java:22)
        at Test1.m1(Test1.java:25)
        at Test1.main(Test1.java:29)


jvm has default exception handling method to display the exception

see it on Test2.java