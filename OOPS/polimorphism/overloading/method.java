class method{
	static void m1(int a){
		System.out.println("one arg int method");
	}
	static void m1(int a,int b){
		System.out.println("two arg int method");
	}
	static void m1(int a,char b){
		System.out.println("two arg int and char method");
	}
	static void m1(char a){
		System.out.println("one arg char method");
	}
	public static void main(String[] args){
		m1(5);
		m1(1,2);                       // here static methods no need to create onject and then access (memory allocated diuring class creation)
		m1(1,'b');						// if you use instance methoc then you have to access using object (memory allocated during object creation)
		m1('c');
	}
}