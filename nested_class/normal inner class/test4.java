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
					3.) possible to create the static block also.
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
    public class Inner{
        static int a=10;
        static{ // but it is not supported.
            System.out.println("inner class static block " + a);
        }
        Inner(){
            System.out.println("inner class constructor");
        }
        {
            System.out.println("inner class instance block");
        }
    }
    public static void main(String[] args) {
        new Outer4().new Inner();
    }
}

/*
	output : 

	outer class static block
	inner class static block
	outer class instatnce block
	outer class constructor
	inner class instatnce block
	inner class constructor
	
*/


// Inner class Main method not possible:

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
    public class Inner{
        static{ // but it is not supported.
            System.out.println("inner class static block");
        }
        Inner(){
            System.out.println("inner class constructor");
        }
        {
            System.out.println("inner class instance block");
        }
        public static void main(String[] args) {
            new Outer4().new Inner();
        }
    }
}

// If you try to run in the Intellij it won't run.