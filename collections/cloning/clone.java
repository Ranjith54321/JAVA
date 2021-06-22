/*
				clone is nothig but creating the duplicate object i,e already you have the obj but this will be change but you need unchange version so we take that

				it copy data   from heap memory  by using this time will be saved

				for using this we should implement Colanable inteface 

				Clonable is a marker inteface

				// marker interface doen't contain any method , (empty class how provide functionality? )
			   //it provides some fucntionality that are given by JVM 

		         ****All collection classes can implement Colanable Inteface an d Serializbale inteface ****
		         here we see cloning only
*/
class A implements Cloneable{  // clonable is the one of the inbuild interface 
									// here it is used to clone the object nothing but we back-up the object
	int a = 111;
	int b = 555;
	public static void main(String[] args) throws Exception {   
		A q = new A();
		System.out.println("a = "+q.a);
		System.out.println("a = "+q.b);
		q.a = 1100;
		q.b = 2200;
		A h = (A)q.clone();                             // cole return type is object class
		System.out.println("a = "+q.a);
		System.out.println("a = "+q.b);
		q.a = 999;
		q.b = 888;
		System.out.println("a = "+q.a);
		System.out.println("a = "+q.b);

		// here i need 1100 and 2200
		System.out.println("a = "+h.a);
		System.out.println("a = "+h.b);


	}
}		         