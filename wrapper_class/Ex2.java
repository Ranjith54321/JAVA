// convert wrapper object to premitive variable or wrapper to string

class Ex2{
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(50);

		int i = i1.intValue();
		float f = i2.floatValue();

		System.out.println(i+f);

		String s1 = i1.toString();
		String s2 = i2.toString();

		System.out.println(s1+s2);

	}
}

// if here not execute here don't feel it excecutes on browser