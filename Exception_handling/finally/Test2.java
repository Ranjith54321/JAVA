// there are two cases finally not excecute

// case 1 : when control not enter into the try block then finally will not excecute
/*
class Test2{
	public static void main(String[] args) {
		System.out.println(10/0);
		try{
			System.out.println("try block");
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op :

F:\java\Exception_handling\finally>java Test2
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test2.main(Test2.java:6)
*/

// case 2 : when programe exit(0)

class Test2{
	public static void main(String[] args) {
		try{
			System.out.println("try block");
			System.exit(0);
		}
		finally{
			System.out.println("finally block");
		}
	}
}

op :

F:\java\Exception_handling\finally>java Test2
try block