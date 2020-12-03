/*
	Exception Propagation 
	here we see how exception is passed to the caller method
*/
note : only un-checked Exception are propagate ******
class Test3{
	void m3(){
		System.out.println(10/0); // you can handle here also
	}
	void m2(){
		m3(); // you can handle here also
	}
	void m1(){
		m2();
		/*try{		m2();}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}*/
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		try{t.m1();}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}

	}
}
op :
java.lang.ArithmeticException: / by zero

/*
	here exception is heappened on m3() it pass the exception to m2() 
	m2() pass Exeption to m1() 
	m1() pass the Exeption to main() 

	on that way from m3() to main() you can handle exception any where,like
			in m3() or in m2() or in m1() or in main()

*/