import java.util.Scanner;
class out {
// to apply counting sort the array elements must be positve not negative elements*****
// counting sort
	static void counting_sort(int[] a,int n){
		int i,max_element=-9;

		// step 1 : find the max_element in the array 
		for(i=0;i<n;i++)
			max_element = Math.max(max_element,a[i]);

		int k = max_element+1;
		// step 2 : create array with size max_element + 1 (it going to acted as a hash table)
		int[] count = new int[k]; // intially all values are zero

		// step 3 : count the each element in the array and update in the count array
		 for(i=0;i<n;i++)
			++count[a[i]];

		// step 4 : add the count with each other then we can make the array more stable 
		for(i=1;i<k;i++)
			count[i] = count[i]+count[i-1];

		// step 5 : create array b with size a to make stable array
		int[] b = new int[n];

		// traverse the a array from last index   [ for this use A array bcoz then only the same nums of two elemenst last one comes after previos] 
		for(i=n-1;i>=0;i--) // see notes
			b[--count[a[i]]] = a[i];
		
		// step 6 : copy the content of the b array to a
		for(i=0;i<n;i++)
			a[i] = b[i];

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter the "+n+" elements : ");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		counting_sort(a,n);

		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}