import java.util.*;
import java.lang.*;
import java.io.*;

class Test1 {
    public static class BinarySearchComparator implements Comparator<Integer>{
        public int compare(Integer i1,Integer i2){
            if(i1.equals(i2)) // here Integer is wrapper object so you can use equals for comparing obj
                return 0;
            else if(i1<i2) // here wrapper class obj is converted to normal variable 
                return 1;
            else
                return -1;
        }
    }
    static BinarySearchComparator comparator = new BinarySearchComparator();
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    String[] s1 = br.readLine().split("\\s");
		    int n = Integer.parseInt(s1[0]);
		    int k = Integer.parseInt(s1[1]);
		    String[] s = br.readLine().split("\\s");
		    int i;
		    int[] a = new int[n];
		    for(i=0;i<n;i++)
		        a[i] = Integer.parseInt(s[i]);
		    int max = Integer.MIN_VALUE;
		    PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
		    for(i=0;i<=(n-k);i++){
		        for(int j=i;j<(i+k);j++){
		            pq.add(a[j]);
		        }
		        System.out.print(pq.peek()+" ");
		        pq.clear();
		    }
		    System.out.println();
		}
	}
}