// command line arguments with wrapper class
class Ex4{
	public static void main(String[] args) {
		Integer i1 = new Integer(args[0]);
		String s1 = new String(args[1]);
		Float f1 = new Float(args[2]);

		System.out.println("length of the command line argument: "+args.length);  //args is array of string thats why we put 
				// if it is string we use str.length()  
		System.out.println("ID : "+(i1+1)); // here you can see even obj also do oppeartion on objects
		System.out.println("NAME : "+s1); 
		System.out.println("SALARY : "+f1);  

	}
}