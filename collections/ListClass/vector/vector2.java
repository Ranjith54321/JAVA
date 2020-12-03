import java.util.Vector;
import java.util.Iterator;
class V2{
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int j=1;j<=30;j++){
			v.add(j);
		}
		System.out.println(v);

		// remove odd elements
		Iterator<Integer> i = v.iterator();
		while(i.hasNext()){
			int it = i.next();
			//Integer it = i.next(); // this also works fine 
			if(it%2!=0)
				i.remove();
		}
		System.out.println(v);
	}
}