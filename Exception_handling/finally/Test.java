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
// case 2 : Abnormal Termination
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
// case 3 : AbNormal Termination
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
		catch(ArithmeticException e){ // exception is matched but here also Exception rasing
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
		catch(ArithmeticException e){ // exception is  matched
			System.out.println(10/0);
		}
		finally{
			 System.out.println("ranjith".charAt(100));  //> this Exception message only will execute
		}
	}
}

op :
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 100
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at org.example.Test.main(AnonymousInnerClass.java:31)
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
