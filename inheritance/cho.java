class parent{
     parent(){
     	System.out.println("this is from parent class");
     }

}
class cho extends parent{
	void m1(int n){
		
		System.out.println(n);
	}
	cho(int n){
		//cho();
		this();
		System.out.println("this is from child no 2 classs");
	}
	cho(){
		//this(20);
		//super();
		System.out.println("this is from child classs");
	}
	
	public static void main(String[] args){

		cho c = new cho(50);
		//super();
		c.m1(10);
	}
}
