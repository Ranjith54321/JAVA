
						nested class in java :
--------------------------------------------------

		declaring a class in side the another class is called nested class in java

		types 2 :

		1.) static nested class
		2.) non-static nested class (inner class)
				1.) normal inner Class
				2.) method local inner Class
				3.) anonumous inner Class

e.g:

class Outer{
	int a=10;
	int b=555;
	void m1(){}

	class Inner{ 
		int x=200;
		int y=300;
		void m2(){}
	}
}

key points :
1.) Compiler will create .Class file for both Outer class and Inner Class 

		Outer.class // for outer class
		Outer$Inner.class // for Inner class

2.) for creating objects for Inner class
	
		Outer o = new Outer();   // 1.) create obj for outer class 
		Outer.Inner i = o.new Inner(); // create Inner class obj with the help of outer class

3.) by using outer obj we only can access Outer class Properties
		like o.a o.b and o.m1()


  ---> like wise Inner class obj can only access Inner Properties
      like i.x i.y and i.m2()

4.) inner class methods can access outer class methods

		outer class cannot access inner class method or any data

----------------------------------

			Advantages :

	1.) if one class logic is required only one time then make that class as Inner class
         eg:
         class A{
         	class B{

         	}
         }

         a. all the logics in single place means it makes strong encapsulation i.e , grouping the data
         b. Readablity increases
         c. inner class can access outer class private Properties

    2.) if the class is required for only one method then create that class inside that method

		class Test{
			void m1(){}
			void m2(){class B{}}
			.
			.
			.
			void m10(){}
		}

	some of the eg's' :

	1->
	class Bank{
		class Accoount{

		}
	}

	2->
	class college{
		class dept{

		}
	}

	3->
	class Map{
		class Entry{

		}
	}
 see java by ratan pdf book :

  study Sequence : 

  	1.) normal innner class
		2.) method local inner class
		3.) static nested class
		4.) anonumous Inner class