// by using try block we can declare multiple resources also

// they are separated by ; 

import java.io.*;
import java.util.Scanner;
class Test3{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);FileInputStream fis = new FileInputStream("abc.txt")){
			System.out.println("not come");
		}
		catch(IOException e){ 
			System.out.println("Exception "+e);
		}
	}
}


op :

F:\java\Exception_handling\try-resources>javac Test3.java

F:\java\Exception_handling\try-resources>java Test3
Exception java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)

here also uncked Exception catch block not reqired but checked Exception catch block mandatory