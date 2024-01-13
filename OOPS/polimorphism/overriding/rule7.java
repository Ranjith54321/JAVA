
/*    *********************** BASED ON MODIFIERS ***************************

   modifier name         Applicable_ for                         Permissions

	public 			vaiables,methods,constructors,classes        anyone can access

	producted		variables,methods							  with in the package is possible,outside the package child class is possible

	private         variables,methods							only with in the class (most restricted)

	default 		variables,methods,classes                   with in the package

	if you not secified any thing before then that is default modifiers

	*/   

//1.)   public (parent methid)  public (child method) same level so overrinding is possible

//2.)  public - producted 	
/*class parent7{
	public  void m1(){
		System.out.println("parent7 m1 method");
	}
}
class child7 extends parent7{
	protected void m1(){                       // here permissioons decreased so not possible
		System.out.println("child7 m1 method");
	}
	public static void main(String[] args) {
	 	parent7 c = new child7();
	 	c.m1();
	}
}  // op: error
*/
// 3.) public private 
/*
class parent7{
	public  void m1(){
		System.out.println("parent7 m1 method");
	}
}
class child7 extends parent7{
	private void m1(){                       // here permissioons decreased so not possible
		System.out.println("child7 m1 method");
	}
	public static void main(String[] args) {
	 	parent7 c = new child7();
	 	c.m1();
	}
}   //op: error
*/
//     4.) public - default 
/*
class parent7{
	public  void m1(){
		System.out.println("parent7 m1 method");
	}
}
class child7 extends parent7{
	void m1(){                       // here permissioons decreased so not possible
		System.out.println("child7 m1 method");
	}
	public static void main(String[] args) {
	 	parent7 c = new child7();
	 	c.m1();
	}
} // op: error
*/
//-------------------------------------------------------------------------------------------------------------

like wise other also see

// Check the Access modifiers Table here : https://www.javatpoint.com/access-modifiers