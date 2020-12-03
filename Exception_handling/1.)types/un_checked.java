/*

	the Exceptions wich are not checked by the compilor is called un_chekced exception

	which shows error msg while run the programe 

	and we can handle this exception through :
		1.) try - catch block (or)  2.) throws ky word


*/
// un-checked Exception child class of Runtime Exception
class test{
	public static void main(String[] args) {
		System.out.println("hey world");

		//System.out.println(10/0); // java.lang.ArithmeticException: / by zero

		int[] a = {10,20,30};
		//System.out.println(a[6]); // java.lang.ArrayIndexOutOfBoundsException:

		Integer i = Integer.valueOf("10"); // this is correct
		//Integer i2 = Integer.valueOf("ten"); //java.lang.NumberFormatException



	}
}

thse Exceptions are not showed by the compilor it will show error while run the programe

we can also handle this Exceptions  