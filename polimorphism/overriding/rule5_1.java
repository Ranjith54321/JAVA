// staic methods not applicable for overrinding bcoz static methods are belongs to class 
// this is METHOD HIDING CONCEPT in java
class parent5_1{
	static void m1(){
		System.out.println("parent m1 method");
	}
}
class child5_1 extends parent5_1{
	static void m1(){
		System.out.println("child5_1 m1 method");
	}
	public static void main(String[] args) {
		parent5_1 p = new child5_1();
		p.m1();   // if you exceute here parent class method only exceue because refence variable belongs to parent **
	}				// this will not show any error but this is not overrinding
}