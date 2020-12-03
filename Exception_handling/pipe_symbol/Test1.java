// example for un-checked exception:
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		try{
			System.out.println("enter the Number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(10/n);
			System.out.println("Ranjith".charAt(12));
		}
		catch(ArithmeticException | NumberFormatException ae){ // here there is no NumberFormatException
			System.out.println("exception : "+ae);
		}
		catch(StringIndexOutOfBoundsException | ClassCastException | NullPointerException ee){ 
			System.out.println("exception : "+ee); // here there is no NullPointerException, ClassCastException
		}
	}
}

op :

exception : java.lang.ArithmeticException: / by zero

F:\java\Exception_handling\pipe_symbol>java Test
enter the Number
2
5
exception : java.lang.StringIndexOutOfBoundsException: String index out of range: 12