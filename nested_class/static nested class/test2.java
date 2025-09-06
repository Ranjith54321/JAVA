class Outer{
	static int a=100,b=200;
	static class Inner2{
		public static void main(String[] args) {
			System.out.println(a+b);
		}
	}
}

output : 

F:\java\nested_class\static nested class>java Outer$Inner2 // see here care fully
300



// Inner static method can assess instance variables and methods but see

class Outer4 {
    static int a=100,b=200;
    int c = 90;

    void m1() {

    }
    static class Inner2{
        static {
            System.out.println(" inner class static block");
        }

        {
            System.out.println(" inner class instance block");
        }

        Inner2() {
            System.out.println(" inner class constructor ");
        }

        void m2() {
            System.out.println(" outer static a : " + a);
            System.out.println(" outer static b : " + b);

            Outer4 o = new Outer4();
            System.out.println(" outer instance c : " + o.c); // even to access instance variable from instance method need obj
            o.m1();

        }
        public static void main(String[] args) {
            System.out.println(a + b + new Outer4().c);
            new Inner2().m2();
        }
    }
}


output:

 inner class static block
 390
 inner class instance block
 inner class constructor 
 outer static a : 100
 outer static b : 200
 outer instance c : 90