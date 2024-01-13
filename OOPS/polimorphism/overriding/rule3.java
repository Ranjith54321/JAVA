class animal{}
class dog extends animal{}

class parent3{
	animal m1(){
		System.out.println("parent method");
		return new animal();
	}
}
class child3 extends parent3{
		dog m1(){
			System.out.println("child method");
			return new dog();
		}
		public static void main(String[] args) {
			child3 c = new child3();
			c.m1();
		}
	}


// you can change the return using co-variant return type concept