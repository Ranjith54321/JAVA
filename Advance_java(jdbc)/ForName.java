// case 1
/*
class Test{
	public static void main(String[] args) {
		// when nothis is there is you run no output 
	}
}
class B {
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
}

// static block is excecute when the class is created 

op :

F:\java\Advance_java(jdbc)>java Test

F:\java\Advance_java(jdbc)>
*/
// case 2 :
/*
class Test{
	public static void main(String[] args) throws ClassNotFoundException{
		// when nothis is there is you run no output

		Class.forName("B");
	}
}
class B {
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
}

op :

F:\java\Advance_java(jdbc)>javac ForName.java

F:\java\Advance_java(jdbc)>java Test    <-- this is the use of forName
static block

*/
// case 3:  to access the instance block

class Test{
	public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException{
		// when nothis is there is you run no output

		Class.forName("B").newInstance(); // so we can call the instance block of other class using forName method
	}
}
class B {
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
}

op :

F:\java\Advance_java(jdbc)>javac ForName.java

F:\java\Advance_java(jdbc)>java Test
static block

it mostly used in jdbc connecivity