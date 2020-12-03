/*
	As you know java does not support multiple heritance but if you want to use another class And thread class
		you can't extend user defined class and thread class at the same time 

		So here we use Runnable Interface


*/
class A{

}
class B extends A implements Runnable{
	public void run(){
		for (int i=0;i<5;i++) {
			System.out.println("hi");
		}
	}
}
class C implements Runnable{
	public void run(){
		for (int i=0;i<5;i++) {
			System.out.println("hello");
		}
	}
}
class Test1{
	public static void main(String[] args) {
		Runnable obj1 = new B();
		Runnable obj2 = new C();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}

op :

F:\java\multithreading>javac Test1.java

F:\java\multithreading>java Test1
hi
hi
hello
hello
hello
hello
hello
hi
hi
hi