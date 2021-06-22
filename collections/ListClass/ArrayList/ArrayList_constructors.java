/*
	in cmd type : javap java.util.ArrayList

1)	  public java.util.ArrayList(int);
2)    public java.util.ArrayList();
3)    public java.util.ArrayList(java.util.Collection<? extends E>);

      you can see this 
         ( after public is there is no return type mean these are constructors )

     so arrayList has 3 contructors
	1.) public java.util.ArrayList();

	  	-> it is default constructor
	  	-> dfault capacity = 10
	  	-> if you add morethan that then automatically  new capacity = old*(3/2)+1 = 16

	2.) public java.util.ArrayList(int)

		 -> that int is nothing but you can initialize capacity
		 -> after initilize if memory exceeds then 
		 			new capacity = old*(3/2)+1

	3.) public java.util.ArrayList(java.util.Collection<? extends E>)

	     -> it is nothing but to add one collection into another colection
	     		for this see the below example

*/
import java.util.ArrayList;
class Ac{
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();   // you shall use generics bcoz it is proper way it will not make any problem
		a1.add(10);
		a1.add(20);
		a1.add(30);

		ArrayList<Integer> a2 = new ArrayList<Integer>(a1); // here you can directly add in to it 
		a2.add(100);
		a2.add(200);

		System.out.println(a2);

		int element = a2.get(1);  // accessing index by using get() method
  
        System.out.println("the element at index 2 is " + element); 

        System.out.println(list.indexOf(100)); //--> it returns the index of the 100 if not available it returns -1;
	}
}

// for memory size increase in ArrayList  while run hide here

1 2 3 4 5 6 7 8 9 10 then

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 (the above content is the ArrayList list will copy here )

when ever the memory is extends the contents are should copy

that is why ArrayList is slower than array************ 