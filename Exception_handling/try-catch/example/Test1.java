/*
	try with multiple catch block's
*/
import java.util.Scanner;
class Test1{
	public static void main(String[] args) {
	try{
		Scanner sc = new Scanner(System.in);
		System.out.println("start the programe");
		int n = sc.nextInt();
		System.out.println(10/n);
		System.out.println("rannjith".charAt(12)); // this will only excecute above statement is not exception
	}
	catch(ArithmeticException ae){
		System.out.println("solved ArithmeticException"+10/2);
	}
	catch(IndexOutOfBoundsException ie){
		System.out.println("IndexOutOfBoundsException");
	}
	}
}