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