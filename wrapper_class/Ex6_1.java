import java.util.ArrayList;
class Ex6_1{
	public static void main(String[] args) {
		// java 1.4 no auto boxing  so you need to pass inte exact same form of wrapper object
		ArrayList a1 = new ArrayList();
		a1.add(new Integer(10));   
		a1.add(new Double(10.5));
		a1.add(new Character('a'));
		System.out.println(a1);

		// java 1.5 : with auto boxing so you can directly pass the premitive values so it automatically convert is
		ArrayList a2 = new ArrayList();
		a2.add(10);   
		a2.add(10.5);
		a2.add('a');
		System.out.println(a2);

		// but internally autoboxing uses ---> integer.valueOf()******* important

		//    eg: a2.add(Integer.valueOf(10));  

	}
}