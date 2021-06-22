/*
		4.)   TreeMap(Comparator<? super K> comparator)  // you your won sort logic using Comparator
					Constructs a new, empty tree map, ordered according to the given comparator.

*/
import java.util.TreeMap;
import java.util.Comparator;
class treemap4{
	public static void main(String[] args) {
		TreeMap<Integer,String> t1 = new TreeMap<Integer,String>(new comp());
		t1.put(55,"ranjith");
		t1.put(7,"dot");
		t1.put(1,"ranjith");
		t1.put(63,"Deeplearn");
		t1.put(2,"machine");
		t1.put(46,"wow");
		t1.put(5,"brawo");

		System.out.println(t1);// {63=Deeplearn, 55=ranjith, 46=wow, 7=dot, 5=brawo, 2=machine, 1=ranjith}
	}
}	

class comp implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2){
		return -i1.compareTo(i2);
	}
}				