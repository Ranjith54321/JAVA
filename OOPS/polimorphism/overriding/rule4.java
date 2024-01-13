/* 
1.)    if parent class is final overriding is not possible  bcoz you can't create the child class

2.)    if class if final then the methods of the class also final by default but the variables are not final
				parent class methods final means you cant acess it on the child class or any other class


*/

final class parent4{
	int a=10;
	void m1(){
		System.out.println("parent method"+a);
	}
	public static void main(String[] args){
		parent4 p = new parent4();
		p.m1();

		// example for final variable
		final int b=50;
		b = b+50;
		System.out.println(b); // shows error bcoz b is final you cant use after that 

	}
}
