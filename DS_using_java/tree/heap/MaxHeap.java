import java.io.*;


public class Main{
	// insertion : 
	public static void insert(int[] a, int data,int i){
		int p;
		while(i>0){
			p = (i-1)/2;

			if(a[p]>=data){
				a[i] = data;
				return;
			} 
			a[i] = a[p];
			i = p;
			
		}
		a[0] = data;
		return;
	}

	public static void print(int[] a,int n){ 
		if(n==0){
			System.out.println("Heap is Empty\n");
			return;
		}

		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		return;
	}

	public static boolean delete(int[] a,int n,int data){
		int left,right,i,p,t;

		for(i=0;i<n;i++){
			if(a[i] == data)
				break;
		}
		if(a[i] != data){
			System.out.print(" Number is not available..\n");
			return false;
		}

		a[i] = a[n-1];
		n = n-1;
		p = (i-1)/2;

		if(a[p]>a[i])
			insert(a,a[i],i);

		left = (2*i)+1;
		right = (2*i)+2;

		while(right < n){
			if(a[right]<=a[i] && a[left]<=a[i])
				return true;
			if(a[right]>a[i]){
				t = a[i];
				a[i] = a[right];
				a[right] = t;
				i = right;
			} else{
				t = a[i];
				a[i] = a[left];
				a[left] = t;
				i = left;
			}

			left = (2*i)+1;
			right = (2*i)+2;
		}

		if(left == n-1 && a[left]>a[i]){
			t = a[i];
			a[i] = a[left];
			a[left] = t;
		}
		return true;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of the Heap");
		int n = Integer.parseInt(br.readLine().trim());
		int[] a = new int[n];

		int index=0;
		int ch;
		do{
			System.out.println("Enter the Choice \n 1.) Insert  2.) Print 3.) Delete 4.) Exit\n");
			ch = Integer.parseInt(br.readLine().trim());

			switch(ch){
				case 1 :{
					
					if(index < n){
						System.out.println("Please Enter the Number\n");
						int data = Integer.parseInt(br.readLine().trim());
						insert(a,data,index);
						index++;
					} else{
						System.out.println("Heap is FULL!!!! \n");
					}
					
					break;
				}
				case 2 :{
					System.out.println("The Heap is --- > \n");
					print(a,index);
					System.out.println();
					break;
				}
				case 3:{
					System.out.println("Please Enter the Number to delete \n");
					int data = Integer.parseInt(br.readLine().trim());
					if(delete(a,index,data))
						index--;
					print(a,index);
					break;
				}
				case 4 : {
					System.out.println("Byeeee\n");
					break;
				}
				default : {
					System.out.println("Please Enter the Correct Choice...\n");
					break;
				}
			}
		}while(ch!=4);
	}
}