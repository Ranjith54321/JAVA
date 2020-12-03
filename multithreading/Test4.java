// setting priority to the threads

class Test4{
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

		t1.setPriority(Thread.MIN_PRIORITY); // or you can pass 1
		t1.setPriority(Thread.MAX_PRIORITY); // or you can pass 10

		// initlally all Thread are hase 5 that is normal priority

		// priority goes from 1 to 10 

		t1.start();
		t2.start();

		t1.join(); // it allow's you to excecute this sthread operation at one time after finiched this thread operation only moves to other thread
		t2.join();

		System.out.println("t1 is alive : "+t1.isAlive());

		System.out.println("bye");

	}
}

op :

F:\java\multithreading>javac Test4.java

F:\java\multithreading>java Test4
hello
hi
hi
hi
hi
hi
hello
hello
hello
hello
t1 is alive : false
bye