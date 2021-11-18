// video link  : https://youtu.be/jtiGAEqa6Yc

interface I{
	void m1();
}

class Main(){
	public static void main(String[] args) {
		I i = new I(){ // class implemntation
			public void m1(){
				System.out.println("Implementation.....");
			}
		};
		i.m1();
	}
}

// op: Implementation.....

/*

	Implementing a class without identity is called anonymous inner class.

	here we have only class implementation.

	To implement a interface in side a main method we use this anonymous inner class


*/