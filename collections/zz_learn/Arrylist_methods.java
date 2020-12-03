class GfG
{
    /*inserts an element x at 
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
	    A.add(x);
    }	
	
    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
	     Collections.sort(A);
    }
	
    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
	    Collections.reverse(A);
    }
	
    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
    	return A.size();
    }
	
    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
	    Collections.sort(A,Collections.reverseOrder());
    }
	
    /*prints space separated 
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
        for(Integer i : A){
            System.out.print(i+" ");
        }
        //System.out.println();
    }
}




				    ----->> see about PriorityQueue and Queue 

				    ---> in ArrayList access the particular index element using get() --> list.get(index_no);

				    System.out.println(list.indexOf(100)); --> it returns the index of the 100 if not available it returns -1;

				    to find frequency in Collections :

				    		Collections.frequency(q,k);

				    for queue  use isEmpty() --> empty() not working 

				    for reverse the Queue use stack