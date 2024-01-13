// parent class method and child class method return type must be same
class parent2{
	int m1(){
		System.out.println("parent method");
		return 0;
	}
}
class child2 extends parent2{
	int m1(){
		System.out.println("child method");      // in rule 1 you can modify the name (but not return type) but that will run but here
		return 0;   							// the return type must be same for the variables same at parent and child class 
	}											// other wise shoes error
	public static void main(String[] args){
		new child2().m1();
	}
}