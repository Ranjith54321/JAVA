/*
	to convert labda expression just implement anonymous class 

	then cut the curly braces and put -> 

*/

// in runnable interfacse


class Test2{
	public static void main(String[] args) {
		Runnable obj1 = new Runnable(){
		public void run(){ // step 1 convert to anonymous class
		for (int i=0;i<5;i++) {
			System.out.println("hi");
		}
	}
};
		Runnable obj2 = ()->
		{  // step two convert to lambda expression -> it is lambda expression
			for (int i=0;i<5;i++) {
			System.out.println("hello");
		}

	};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}

op :

F:\java\multithreading>javac Test2.java

F:\java\multithreading>java Test2
hello
hello
hello
hello
hello
hi
hi
hi
hi
hi



// in normal class
	
class Test2{
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
	}
}

op :

F:\java\multithreading>javac Test2.java

F:\java\multithreading>java Test1
hello
hi
hello
hello
hello
hello
hi
hi
hi
hi
