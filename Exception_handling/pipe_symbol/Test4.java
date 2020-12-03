// either you put child class or parent class but not both

import java.io.*; // fnfe is on io class
class Test4{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("abc.txt");
		}
		catch(IOException | FileNotFoundException e){ 
			System.out.println("Exception : "+e);
		}
	}
}

 op :
 F:\java\Exception_handling\pipe_symbol>javac Test4.java
Test4.java:9: error: Alternatives in a multi-catch statement cannot be related by subclassing
                catch(IOException | FileNotFoundException e){
                                    ^
  Alternative FileNotFoundException is a subclass of alternative IOException
1 error

 -> here  IOException is parent class of FileNotFoundException so it leeds to error
       -> you should use either parent or children but not both