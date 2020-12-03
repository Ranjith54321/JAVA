import java.util.*;
import java.lang.*;
class Student implements Comparable<Student>{
	private int rank;
	private String name;
	Student(String name,int rank){
		this.rank = rank;
		this.name = name;
	}
	public int compareTo(Student st){
		if(rank < st.rank)
			return -1;
		else if(rank > st.rank)
			return 1;
		return 0;
	}
	public String toString(){
		String result = "Student name : "+name + ", rank: "+rank;
		return result;
	}
}
public class Test{
	public static void main(String[] args) {
		PriorityQueue<Student> stq = new PriorityQueue<>();

		stq.add(new Student("ranjith",5));
		stq.add(new Student("dot",1));
		stq.add(new Student("singam",6));
		stq.add(new Student("alan",2));

		System.out.println(stq.size());

		Iterator<Student> it = stq.iterator();
		while(it.hasNext()){
			System.out.println(" Student detail : for : "+stq.poll().toString());
		}
	}
}