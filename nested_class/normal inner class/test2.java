/*
	it is possible to create the main method inside the outer class also

	but we can't careate main method inside the inner class
*/
class Outer{
	int a=10,b=20;
	class Inner{
		int x=100,y=200;
		void add(int i,int j){
			System.out.println(i+j);
			System.out.println(x+y);
			System.out.println(a+b);
		}
	}
	public static void main(String[] args) {
		/*Outer o = new Outer();

		Outer.Inner i = o.new Inner();

		i.add(1000,2000);*/

		// one line approach

		new Outer().new Inner().add(1000,2000);  
	}
}


/*
	inside the inner class it is unable to declare the static members hence the inner classes it not possible to declare main because main is static

	-> But, it seems java 16+ supports static members need to check..

	but we can careate final constant variables as static eg :

	class Outer{
		class Inner{
			final static int i = 10; // here final variable is called as constant variable
		}
	}
*/
// output 

/*
	3000
	300
	30

*/