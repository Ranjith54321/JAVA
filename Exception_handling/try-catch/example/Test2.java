/*
try with single catch block
*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args) {
		//int m;
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("start the programe");
		int n = sc.nextInt();
		 //m = sc.nextInt();
		System.out.println(10/n);
		System.out.println("rannjith".charAt(12)); // this will only excecute above statement is not exception
	}
	catch(Exception e){
		//System.out.println(n +" "+ae); you cant access the try block variables here
		System.out.println(" "+e); // but you can access the class variable
	}

	}
}

op ;

2
5
 java.lang.StringIndexOutOfBoundsException: String index out of range: 12
/*
	Exception :

	 it is the parent class of all exception's 

	 so it can get any exception 

*/