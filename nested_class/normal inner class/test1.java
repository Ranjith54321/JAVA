/*
	declare a class inside the another class is called normal inner class

	Eg: 

	class Outer
	{
		class Inner{
	
		}
	}


	in this example we see

	inner class can access outer class private properties and methods

	here we careate object from separate class

	for more notes see the pdf book by ratan also see these eg also pg.no : 295

*/
class Outer{
	private int a=10;
	int b=20;
	void m1(){ System.out.println("outer class m1() method");}
	class Inner{
		int x=200,y=300;
		void m2(){ 
			System.out.println("inner class m1() method");

			System.out.println(a+b); // outer class private variable and instatnce variable
			System.out.println(x+y);
			m1(); // accessing outer class method
		}
	}
}
class test1{
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();

		o.m1();
		i.m2();
	}
}

// output

/*
		outer class m1() method
		inner class m1() method
		30
		500
		outer class m1() method

*/