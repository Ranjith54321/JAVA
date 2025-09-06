/*
						Method Local Inner Class

			decalare a class inside the mthod is called method local inner class 

			example structure

			class Outer{
					void m1(){
						class Inner{
							
						}
						class Inner2 extends Inner{
						
						}
					}
				   void m2(){
						class Inner3{
	
						}
				   }
			}

	supported modifiers words :

	Outer classes : public, default, final, abstract, strictfp
	Inner classes : public, default, final, abstract, strictfp, static, private, proteted

*/
// so method local inner classes scope is only inside the method
// inside the method you can create the class obj 

class Outer{
	void m1(){
		abstract class Inner1{
			void m2(){ System.out.println("Inner class abstract-calss method");}
		}
		class B extends Inner1{
			void m3(){ System.out.println("Inner class normal method");}
		}
		B b = new B();
		b.m2();
		b.m3();
	}
	public static void main(String[] args) {
		new Outer().m1();
	}
}

/*
	output : 

	Inner class abstract-calss method
	Inner class normal method

*/

	// normal example :  

class Outer{
	void m1(){
		class Inner1{
			void m2(){ System.out.println("Inner class abstract method");}
		}
		new Inner1().m2();
	}
	public static void main(String[] args) {
		new Outer().m1();
	}
}




	// inner class in staic method also possible:

class Outer2 {
    static void m1() {
        class Inner1{
            void m2(){ System.out.println("Inner class abstract method");}
        }
        new Inner1().m2();
    }
    public static void main(String[] args) {
         Outer2.m1();
    }
}