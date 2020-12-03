// case 1 : Normal Termination
/*
class Test{
	public static void main(String[] args) {
		try{
			System.out.println("try block");
		}
		catch(ArithmeticException e){
			System.out.println("catch block");
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op :

F:\java\Exception_handling\finally>java Test
try block
finally block */

/*
// case 2 : Normal Tesrmonation
class Test{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("catch block");
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op:

F:\java\Exception_handling\finally>java Test
catch block
finally block

*/
/*
// case 3 : AbNormal Tesrmonation
class Test{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(NullPointerException e){ // exception is not matched
			System.out.println("catch block");
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op :

F:\java\Exception_handling\finally>java Test
finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:51)

 here see before exception the finally block is excecuted
 */
/*
 // case 4 : AbNormal Termination
class Test{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e){ // exception is not matched
			System.out.println(10/0);
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op :

F:\java\Exception_handling\finally>java Test
finally block
Exception in thread "main" java.lang.A

*/
/*
 // case 5 : AbNormal Termination finally block also contains exception
class Test{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e){ // exception is not matched
			System.out.println(10/0);
		}
		finally{
			System.out.println(10/0);
		}
	}
}

op :
F:\java\Exception_handling\finally>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:105)
 */

 // case 6 : try and finally only
class Test{
	public static void main(String[] args) {
		try{
			System.out.println("try block");
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op :

F:\java\Exception_handling\finally>java Test
try block
finally block
