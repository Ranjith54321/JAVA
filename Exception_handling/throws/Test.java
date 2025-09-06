/*
		2 ways to handle the exception :

		1.) try-catch block
		2.) throws key word     Note: all examples carefully catch block is here not excute see why 

		try catch block can handle the excption by it self

		but thorws pass the exception to caller method ****

*/
		// case 1 handle using try-catch block
		/*
class Test{
	void hod(){
		try{
			System.out.println("student is sleeping");
			Thread.sleep(1000);
			System.out.println("student is sleeping2");
		}
		catch(InterruptedException e){ 
			System.out.println("again");// this will not excecute  // but we should handle the checked exception other wise it will not run
		}
	}
	void princepal(){
		hod();
	}
	void helper(){
		princepal();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.helper();
	}
}

op :

student is sleeping 
 --> after 1000 milli seconds
student is sleeping2

*/

// case 2 : handle using throws key word
// handled by one of the caller method 
/*
class Test{
	void hod() throws InterruptedException{ // this can be handle by any one of the caller method or it will handled by JVM 
		System.out.println("student is sleeping");		// but we should pass the (throws) exception properly
		Thread.sleep(1000);
		System.out.println("student is sleeping2");
	}
	void principal(){
		try{hod();}
		catch(InterruptedException e){e.printStackTrace();} // for this op :student is sleeping -->after 1000 milli seconds
										//               student is sleeping2
	}
	void helper(){
		principal();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.helper();
	}
}

op :

student is sleeping 
 --> after 1000 milli seconds
student is sleeping2

*/

// handled by JVM but we should pass the exception properly


class Test{
	void hod() throws InterruptedException{ // this can be handle by any one of the caller method or it will handled by JVM 
		System.out.println("student is sleeping");		// but we should pass the (throws) exception properly
		Thread.sleep(1000);
		System.out.println("student is sleeping2");
	}
	void princepal() throws InterruptedException{
		hod();
	}
	void helper() throws InterruptedException{
		princepal();
	}
	public static void main(String[] args) throws InterruptedException{ // we thorw the exception here it pass to jvm 
		Test t = new Test();												// now JVM is going to handle this exception
		t.helper();
	}
}

op :

student is sleeping 
 --> after 1000 milli seconds
student is sleeping2
