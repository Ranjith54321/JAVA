//constructor over loading 
class constructor{
	constructor(int a){
		System.out.println("one arg int constructor");
	}
	constructor(int a,int b){
		System.out.println("two arg int constructor");
	}
	constructor(int a,char b){
		System.out.println("two arg int and char constructor");
	}
	constructor(char a){
		System.out.println("one arg char constructor");
	}
	public static void main(String[] args){
			new constructor(1);    // constructors are execute while object creation
			new constructor(1,2);
			new constructor(1,'v');
			new constructor('c');
	}
}