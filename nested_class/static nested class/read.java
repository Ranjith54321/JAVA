		static nested class

		if inner class is declared as static then that is called as static nested class

	   eg:

	class outer{
		static class inner{

		}
	}

difference :
 
 1.) Normal Inner class :

 class Outer{
 	int a=10;
 	static int  b=20;
 	class Inner{
 		System.out.println(a);  // possible
 		System.out.println(b); // possible
 	}
 }

 1.) can access both instance and static members
 2.) static declarations are not allowed
 3.) main method, static block not allowed
			// but in our experiment, we can create static variables and methods but not main method. => Intellij IDE not allowed
 4.) obj creation : new Outer().new Inner();


--------------------
  2.) static nested class

	 class Outer{
	 	int a=10;
	 	static int  b=20;
	 	static class Inner{
	 		System.out.println(a);  // not possible
	 		System.out.println(b); // possible
	 	}
	 }

	1.) it can ONLY access static members *directly*
	2.) static declarations are possible
	3.) main methods, static blocks possible
	4.) obj creation :
		new Outer.Inner(); // not new outer() // see no braces
				 ^
		   		 |-> in this place new key word is not reqired bcoz it static class