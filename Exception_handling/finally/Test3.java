// interview questions
/*
class Test3{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Ranjith".charAt(12));
		}
		finally{
			int[] a = {10,20,30};
			System.out.println(a[10]);
		}
	}
}
  //--> always lastly arised Exception is displayed 
op :

F:\java\Exception_handling\finally>java Test3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Test3.main(Test3.java:13)
*/

class Test3{
	int m1(){
		try{
			return 10;
		}
		catch(ArithmeticException e){
			return 20;
		}
		finally{
			return 30;
		}
	}
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println("the value is "+t.m1());
	}
}

op :

F:\java\Exception_handling\finally>javac Test3.java

F:\java\Exception_handling\finally>java Test3

the value is 30  <---****note the o/p *******

--> always finally block statement excute last