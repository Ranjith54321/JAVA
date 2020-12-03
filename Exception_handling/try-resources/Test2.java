/*
import java.io.*;
class Test2{
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("abc.txt")){
			System.out.println("not come");
		}
	}
}

op :

Test2.java:4: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                try(FileInputStream fis = new FileInputStream("abc.txt")){
                                          ^
Test2.java:4: error: unreported exception IOException; must be caught or declared to be thrown
                try(FileInputStream fis = new FileInputStream("abc.txt")){
                                    ^
  exception thrown from implicit call to close() on resource variable 'fis'
2 errors

*/
// when we use checked exception catch block is mandatory

import java.io.*;
class Test2{
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("abc.txt")){
			System.out.println("not come");
		}
		catch(IOException e){ // it is parent if FileNotFoundException
			System.out.println("Exception "+e);
		}
	}
}

// here we have two error's see above output so use IOEXeption to handle both

op:

F:\java\Exception_handling\try-resources>javac Test2.java

F:\java\Exception_handling\try-resources>java Test2
Exception java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)