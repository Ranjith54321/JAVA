/*
	try with multiple catch block parent to child exception
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
		catch(Exception e){
		System.out.println(" "+e); // but you can access the class variable
	}
	catch(ArithmeticException ae){
		System.out.println(10/2);
	}

	}
}

op : (compile time error)

Test4.java:17: error: exception ArithmeticException has already been caught
        catch(ArithmeticException ae){
        ^
1 error
