// checked Exception

/*
type 1: 
class Test2{
	public static void main(String[] args) {
		try{
			Thread.sleep(10000);
			System.out.println("come on velu");
		}
		catch(InterruptedException e){
			System.out.println("Exception : "+e);
		}
	}
}

op :

F:\java\Exception_handling\pipe_symbol>javac Test2.java

F:\java\Exception_handling\pipe_symbol>java Test2
come on velu

NOTE : HERE Exception NOT arised bcoz we already catched so it print out put after few seconds

*/
/*
//type 2: 
import java.io.*; // fnfe is on io class
class Test2{
	public static void main(String[] args) {
		try{
			Thread.sleep(10000);
			System.out.println("come on velu");
		}
		catch(InterruptedException | FileNotFoundException e){ // here there is no FileNotFoundException so error
			System.out.println("Exception : "+e);
		}
	}
}

 op: 

 F:\java\Exception_handling\pipe_symbol>javac Test2.java
Test2.java:36: error: exception FileNotFoundException is never thrown in body of corresponding try statement
                catch(InterruptedException | FileNotFoundException e){
                ^
1 error

*/

//type 3: 
import java.io.*; // fnfe is on io class
class Test2{
	public static void main(String[] args) {
		try{
			Thread.sleep(10000);
			System.out.println("come on velu");
			FileInputStream fis = new FileInputStream("abc.txt");
		}
		catch(InterruptedException | FileNotFoundException e){ // here there is no FileNotFoundException so error
			System.out.println("Exception : "+e);
		}
	}
}

op : 

F:\java\Exception_handling\pipe_symbol>javac Test2.java

F:\java\Exception_handling\pipe_symbol>java Test2
come on velu
Exception : java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)