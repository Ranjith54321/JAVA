// private modifier

// most restricted modifier in java  

// if you use private method then overrinding is never possible

// private modifier only with in the class 
class parent6{
	private void m1(){
		System.out.println("parent6 m1 method");
	}
}
class child6 extends parent6{
	private void m1(){
		System.out.println("child6 m1 method");
	}
	public static void main(String[] args) {
	 	parent6 c = new child6();  // here parent reference variable can't access the child m1 method so overrinding is not possible
	 	c.m1();
	}
}

/// this is out-put console error:

/*
 
rule6.java:18: error: m1() has private access in parent6
                c.m1();
                 ^
1 error

 */
