/*
	checked Exception :

	these error msg is showed by the compilor before the run of the application

	but this exception are only heappen while compiling the programe 

	so you can call it as run compile exception

	it is also handle by the try-catch or throws key word

*/
	// checked Exception child class of  Exception
import java.io.*;// for FileInputStream 
class test2{
	public static void main(String[] args) {
		System.out.println("hello boi");
		//Thread.sleep(10000); //InterruptedException 

		FileInputStream fis = new FileInputStream("abc.txt");// FileNotFoundException
	}
}

/*
	whether it is checked Exception or un-checked Exception, the Exception heappens at run time

	checked Exception is safe bcoz it shows the exception before the run of the programe

*/