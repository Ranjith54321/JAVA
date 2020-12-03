//to achive the overriding concept in java we need --->   two java class with inheritance relation ship
// rule 1 parent class method sugnatire and child class method singnature must be same (method name and argument list-> signature)
class parent{
	void m1(){
		System.out.println("parent method");
	}
}
class child extends parent{ // apply inheritance
	void m1(){
		System.out.println("child method");   // why it is needed is is you have same methods but you need other operation then you pick this 
	}
	public static void main(String[] args){
		new child().m1();
	}
}