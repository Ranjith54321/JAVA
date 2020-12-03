// you can se both checked and un-checked exception but :

 /* un-checked exception's that are mentioned inside your catch block need not be present in the try block 
			but checked exception's that are mentioned inside your catch block must be present in the try block */
class Test3{
	public static void main(String[] args) {
		try{
			Thread.sleep(1000);
			System.out.println("come on velu");
		}
		catch(InterruptedException | ArithmeticException e){ // here there is no ArithmeticException but no error
			System.out.println("Exception : "+e);             // bcoz  ArithmeticException is un-checked Exception
		}
	}
}

op :

F:\java\Exception_handling\pipe_symbol>javac Test3.java

F:\java\Exception_handling\pipe_symbol>java Test3
come on velu