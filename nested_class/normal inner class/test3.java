/*
		using same variable name for the outer class inner class and local variables
*/
class Outer3{
    int x=10,y=20;
    static int a=10, b=90;
    class Inner{
        int x=100,y=200;
        void add(int x,int y){
            System.out.println(x+y);
            System.out.println(this.x+this.y); // to access Inner class variable use this key word
            System.out.println(Outer3.this.x+Outer3.this.y); // to access outer class variables use oute class name .(dot) this key word
            System.out.println(Outer3.a+Outer3.b); // to access outer class static variables we no need this key word, but to access instance variables we need this keyword.
        }
    }
    public static void main(String[] args) {
        new Outer3().new Inner().add(1000,2000);
    }
}
/*
	output :

	3000
	300
	30
	100
*/