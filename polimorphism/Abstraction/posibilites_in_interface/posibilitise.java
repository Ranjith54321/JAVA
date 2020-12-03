1.) interface with inheritance

eg: 1 )
interface i1{
	void m1();
	void m2();
}
interface i2 extends i1{
	void m2();  // redeclaration is not problem
}
class A implements i2{
	// code
}

eg : 2 
interface i1{
	void m1();
	void m2();
}
interface i2 extends{
	void m2();  // redeclaration is not problem
}
interface i3 extends i1,i2{ // for interface only it is allowed
	void m2();
	void m3();
}
class A implements i1,it{ // it is allowed
	// code
}

------------------------------------------------------------
  
  2.) extends and implements realtion

class A extends class B

interface i extends interface i2

class A implements interface i

--------------------------------------------------

3.)   for class allowed : 

class A extends  class B   ------valid

class A extends  class B,c   ------invalid

class A implements  interface i   ------valid

class A implements  interface i,i2   ------valid

class A extends  class A   ------invalid

----------------------------------------------------------

4.) for interface allowed :

		interface i extends interface i2 -----valid
		
		interface i extends interface i2,i3 -----valid

		interface i extends class A -----invalid

		interface i extends interface i -----invalid

-------------------------------------------------------------

5.) extends with implements (always extends first)

	class A extends B implements i1,i2 --------- valid

	class A implements i1,i2 extends B ----------invalid




