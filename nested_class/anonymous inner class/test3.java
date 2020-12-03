// implemet anonymous class for interfaces

interface i1{
	void m1();
} 
class test3{
	public static void main(String[] args) {
		i1 a = new i1(){
			void m1(){System.out.println("interface using anonymous class");}
		};
		a.m1();
	}
}
/*
	output :
	interface using anonymous class
*/
	// here  A class is the internally created class it over rides the interface methods



conclusion of inner class :

	1. Length of the code reduced : bcoz w e are implementing overrding class

	2. internally class generated : byte code incresed

	lambda expresion ;

	1. reduced the length of the code  
	2. reduce the byte code 