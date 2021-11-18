import java.util.*; // here we are storing weight on the source destionation position of the matrix, since it is a un-directed Graph
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the number of edges and vertices : ");
		
		int n = sc.nextInt();
		int v = sc.nextInt();
		
		int[][] g = new int[v][v];
		
		System.out.println("Enter the source and destination : ");
		
		for(int i=0;i<n;i++){
		    int s = sc.nextInt();
		    int d = sc.nextInt();
		    
		    System.out.println("Enter the values : ");
		    
		    g[s][d] = sc.nextInt();
		    g[d][s] = g[s][d];
		}
		
		System.out.println("== finally the Grapgh is : : : ==");
		
		for(int i=0;i<v;i++){
		    for(int j=0;j<v;j++){
		        System.out.print(g[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}