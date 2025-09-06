/*
		we can handle the exception using try-catch block and throws key word

		try{
		statement...(may or may not excecute)
		}
		catch(Exception passed by the try block){
		statement..(it will execute when exception raised)
		}
*/

/*
//Eg: 1 :
class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(10/0);
		System.out.println("hello bot");
	}
}

op: 
hello world 
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:14)

here see after hello world rest of the app not excecuted

 --> so to controll this we gonna use try-catch block

 */

/* //Eg : 2 : use try-catch block

 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
		System.out.println(10/0);}
		catch(ArithmeticException ae){
			System.out.println(10/2);
		}
		System.out.println("hello bot");
	}
}

op : 
hello world
5
hello bot*/

/* //Eg : 3 : if Exception is not matched then programe will terminate automatically

 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
		System.out.println(10/0);}
		catch(NullPointerException ae){
			System.out.println(10/2);
		}
		System.out.println("hello bot");
	}
}

op :
hello world
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:58)
   */

/*
  //Eg : 4 : if try block has no Exception then catch block not excecute

 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
		System.out.println(10/2);}
		catch(ArithmeticException ae){
			System.out.println(10/2);
		}
		System.out.println("hello bot");
	}
}

op :
hello world
5
hello bot

*/

/*
//Eg : 5 : we can't use try block alone even if no exception

 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
		System.out.println(10/2);}
		
		System.out.println("hello bot");
	}
}

op :
Test.java:98: error: 'try' without 'catch', 'finally' or resource declarations
                try{
                ^
1 error

it should follow catch finally or anyresource declaration

*/

/*
 //Eg : 6 : in between the two blocks [try-catch or try-finally] statemrnt declaration is invalid

 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
		System.out.println(10/2);}
		System.out.println("it will not run");
		catch(ArithmeticException ae){
			System.out.println(10/2);
		}
		System.out.println("hello bot");
	}
}

op :
Test.java:122: error: 'try' without 'catch', 'finally' or resource declarations
                try{
                ^
Test.java:125: error: 'catch' without 'try'
                catch(ArithmeticException ae){
                ^
2 errors

*/

/*
//Eg : 7 : only try block exception only allowed other than that shows exception 

 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
		System.out.println(10/0);}

		catch(ArithmeticException ae){
			System.out.println(10/0);
		}
		System.out.println("hello bot");
	}
}

op:
hello world
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:152)


*/
/*
 //Eg : 7 : after exception no other statemrnts will excecute
        //7.1 :
 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
			System.out.println("developer");
			System.out.println("life");
			System.out.println(10/0);
	   }
		catch(ArithmeticException ae){
			System.out.println(10/2);
		}
		System.out.println("hello bot");
	}
}
op :
hello world
developer
life
5
hello bot
*/
//7.2 :
 class Test{
	public static void main(String[] args) {
		System.out.println("hello world");
		try{
			System.out.println(10/0); // now here
			System.out.println("developer");
			System.out.println("life");
			
	   	}
		catch(ArithmeticException ae){
			System.out.println(10/2);
		}
		System.out.println("hello bot");
	}
}

op :

hello world
5
hello bot