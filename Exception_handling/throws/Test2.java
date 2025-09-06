// case 3 : we can throw multiple excption at a time
/*
import java.io.*;
class Test2{
	void m2() throws InterruptedException,FileNotFoundException{
		System.out.println("sleep1");
		Thread.sleep(1000);
		System.out.println("sleep2");
		FileInputStream fis = new FileInputStream("abc.txt");
	}
	void m1(){
		try{m2();}
		catch(InterruptedException|FileNotFoundException e){System.out.println(e);}
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();
	}
}

op :

sleep1
sleep2
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)

*/

// case 3.1 : we can throw multiple excption at a time and you can handle any no of exception inthe caller method
/*
import java.io.*;
class Test2{
	void m2() throws InterruptedException,FileNotFoundException{
		System.out.println("sleep1");
		Thread.sleep(1000);
		System.out.println("sleep2");
		FileInputStream fis = new FileInputStream("abc.txt");
	}
	void m1() throws FileNotFoundException{
		try{m2();}
		catch(InterruptedException e){System.out.println(e);}
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		try{t.m1();}
		catch(FileNotFoundException e){System.out.println(e);} // you can pass the FNE to JVM also
	}
}

op :

sleep1
sleep2
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)

*/
// case 4: instead of throwing multiple exception yo can simply pass the Exception class
import java.io.*;
class Test2{
	void m2() throws Exception{
		System.out.println("sleep1");
		Thread.sleep(1000);
		System.out.println("sleep2");
		FileInputStream fis = new FileInputStream("abc.txt");
	}
	void m1() throws Exception{
		m2();
	}
	public static void main(String[] args) throws Exception{
		Test2 t = new Test2();
		t.m1();
	}
}

op :

sleep1
sleep2
Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at Test2.m2(Test2.java:64)
        at Test2.m1(Test2.java:67)
        at Test2.main(Test2.java:71)

Note :

	--> un-checked Exception are automaticlay propagated 

		eg :

class Test2{
	void m1(){  // here you can put throws ArithmeticException 
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1(); // so the exceptiin is automatically propagated to JVM 
	}
}

--> but checked Exception should be propageted by the user

--------->>****** so throws key word is mainly used for checked Exception