
class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void insert(int B)
    {
	   s1.push(B);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int remove()
    {
	   if(s1.empty()){
	        if(s2.empty())return -1;
	       
	        else
	            return s2.pop();
	   }
	   else{
	        if(!s2.empty())
	            return s2.pop();
	        while(!s1.empty()){
	           s2.push(s1.pop());
	        }
	        return s2.pop();
	   }
    }
}
