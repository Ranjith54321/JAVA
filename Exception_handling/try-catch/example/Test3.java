/*
	try with multiple catch block child to parent exception
*/
import java.util.Scanner;
class Test3{
	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("start the programe");
		int n = sc.nextInt();
		System.out.println(10/n);
		System.out.println("rannjith".charAt(12)); // this will only excecute above statement is not exception
	}
	catch(ArithmeticException ae){
		System.out.println(10/2);
	}
	catch(Exception e){
		System.out.println(" "+e); // but you can access the class variable
	}
	}
}
op ;

2
5
 java.lang.StringIndexOutOfBoundsException: String index out of range: 12