/*
		we can create 
			outer class 
				1.) constructor
				2.) static block
				3.) instatnce block
		we can create 
				Inner class
					1.) constructor
					2.) instatnce block
				we can create Inner class static block
*/

class Outer4{
	Outer4(){
		System.out.println("outer class constructor");
	}
	{
		System.out.println("outer class instatnce block");
	}
	static{
		System.out.println("outer class static block");
	}
	class Inner{
		Inner(){
			System.out.println("inner class constructor");
		}
		{
			System.out.println("inner class instatnce block");
		}
	}
	public static void main(String[] args) {
		new Outer4().new Inner();
	}
}

/*
	output : 

	outer class static block
	outer class instatnce block
	outer class constructor
	inner class instatnce block
	inner class constructor
	
*/