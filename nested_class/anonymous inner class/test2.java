/*
this below code implementation is normal way of implementing abstract class 

abstract  class A2{
	abstract void m1();
}
class test2 extends A2{
	void m1(){ System.out.println("abstract anonymous method");}
}
class client{
	public static void main(String[] args) {
		test2 t = new test2();
		tm1();
	}
}*/

// implement abstract class using anonymouse class
abstract class A2{
	abstract void m1();
}
class test2{ 
	
	public static void main(String[] args) {
		//A a = new A(){
		A2 a = new A2(){ // this is also correct 
		void m1(){ System.out.println("abstract anonymous method");}
		};
		a.m1();
	}
}

//here  A class is the internally created class it over rides the absatract class methods
// A2 class obj inside the method is is just local class created by compailor you know abstract class we vant create obj


/*
	output :

	abstract anonymous method
*/