/*

class Test3{
	public static void main(String[] args) {

		Thread t1 = new Thread(()->{
		for (int i=0;i<5;i++) {
			System.out.println("hi");
		}
	});
		Thread t2 = new Thread(()->{
		for (int i=0;i<5;i++) {
			System.out.println("hello");
		}
	});

		t1.start();
		t2.start();

		System.out.println("bye");

	}
}

op :

F:\java\multithreading>javac Test3.java

F:\java\multithreading>java Test3
bye
hi
hi
hi
hi
hi
hello
hello
hello
hello
hello

*/

// if you want to print by at last the use join() method it combines user defines threads

class Test3{
	public static void main(String[] args) throws Exception{

		Thread t1 = new Thread(()->{
		for (int i=0;i<5;i++) {
			System.out.println("hi");
		}
	});
		Thread t2 = new Thread(()->{
		for (int i=0;i<5;i++) {
			System.out.println("hello");
		}
	});

		t1.start();
		t2.start();

		t1.join(); // it will throw Exception
		t2.join();

		System.out.println("t1 is alive : "+t1.isAlive());

		System.out.println("bye");

	}
}

op :

F:\java\multithreading>javac Test3.java

F:\java\multithreading>java Test3
hi
hello
hello
hello
hello
hello
hi
hi
hi
hi
t1 is alive : false
bye