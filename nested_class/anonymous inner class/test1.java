/*
if you use anonymous inner class inside the main method no need to  create obj for the main class

*/
class client2{
	public static void main(String[] args) {
		A a = new A(){
			void m1(){System.out.println("this is display method");}
		};
		a.m1();
	}
}

/*
	output :

	this is display method
*/

	// it internally creates the A class 