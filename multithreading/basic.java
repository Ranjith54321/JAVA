// see the introduction on the java by ratan(2016) pg no : 217 

example : 1

class MyThread extends Thread{
	public void run(){
		for (int i=0;i<5 ;i++ ) {
			System.out.println("this is thread method");
		}
	}
} 

class Demo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=0;i<5 ;i++ ) {
			System.out.println("thi is main class method");
		}
	}
}

op :

F:\java\multithreading>javac basic.java

F:\java\multithreading>java Demo
thi is main class method
thi is main class method
thi is main class method
thi is main class method
thi is main class method
this is thread method
this is thread method
this is thread method
this is thread method
this is thread method

F:\java\multithreading>java Demo
thi is main class method
this is thread method
thi is main class method
thi is main class method
thi is main class method
thi is main class method
this is thread method
this is thread method
this is thread method
this is thread method

	-----> as you can see the output formate is not predictable

	--> if more than one thread is available then the thread excecution is decided by the thread scheduler which is part of the jvm

	--> here public static void main(String[] args) is called the main thread then the user defined thread

	when ever you call start() function then only thread scheduler know and it regester it 


------------------------------------------
example 2 :

t.start()  Thread start Exception user thread is created
t.run() run() will be excecuted just like a normal method call thread is not created [-->if you created the run() method in user defined thread class

---> Thread class have empty implementaion of run() method

--> here we use in user defined thread class start() method register this thread and cpu thread scheduler calls it when the program starts

-----------------------------------

example 3 :


class MyThread extends Thread{

} 

class Demo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=0;i<5 ;i++ ) {
			System.out.println("thi is main class method");
		}
	}
}

if you are not having run() method in user defined thread class then Thread class run() method will Excecute but it has empty implementaion

--------------

example 4:

class MyThread extends Thread{
	public void start(){
		for (int i=0;i<5 ;i++ ) {
			System.out.println("this is thread method");
		}
	}
} 

class Demo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=0;i<5 ;i++ ) {
			System.out.println("thi is main class method");
		}
	}
}

---> if you Override start method your start method only going to excecute thread will not be created

	--> so it is not recommnded to Override start method

---------------------------------------

example 5 :

class MyThread extends Thread{
	public void run(){
		for (int i=0;i<5 ;i++ ) {
			System.out.println("this is thread method");
		}
	}
	public void run(int a){
		for (int i=0;i<5 ;i++ ) {
			System.out.println("this is thread method");
		}
	}
} 

class Demo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=0;i<5 ;i++ ) {
			System.out.println("thi is main class method");
		}
	}
}

--> you can OverLoad *** the run() method but when you create start method jvm automatically calls the 0-arg run() method

-------------------------
example 6:

you can split the thread task using methods

class MyThread extends Thread{
	public void run(){
		m1();
		m2();
		m3();
	}
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
	}
	public void m3(){
		System.out.println("m3 method");
	}
} 

class Demo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=0;i<5 ;i++ ) {
			System.out.println("thi is main class method");
		}
	}
}

----------------------------

example 7 :

you can create multiple start() methods for single thread class that manny Number of stack memory will created

class MyThread extends Thread{
	public void run(){
		for (int i=0;i<5 ;i++ ) {
			System.out.println("this is thread method");
		}
	}
} 

class Demo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		MyThread t2 = new MyThread();
		t2.start();
		MyThread t3 = new MyThread();
		t3.start();
	}
}

-------------------------
example 8 :

multiple user defined thread class :

class MyThread1 extends Thread{
	public void run(){
		System.out.println("MyThread1 method");
	}
} 
class MyThread2 extends Thread{
	public void run(){
		System.out.println("MyThread2 method");
	}
}
class MyThread3 extends Thread{
	public void run(){
		System.out.println("MyThread3 method");
	}
}
class Demo{
	public static void main(String[] args) {
		new MyThread1().start();
		new MyThread2().start();
		new MyThread3().start();
	}
}

op :

F:\java\multithreading>java Demo
MyThread2 method
MyThread1 method
MyThread3 method

F:\java\multithreading>java Demo
MyThread2 method
MyThread3 method
MyThread1 method