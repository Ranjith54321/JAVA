import java.util.*;
class DFS{

	public static void dfs(int[][] g,int[] size,int[] list,int start){
		list[start] = 1;
		System.out.print(start+"->");
		for (int i=0;i<size[start];i++) {
			if(list[g[start][i]]==0)
				dfs(g,size,list,g[start][i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		int i;
		int[][] g = new int[v][v];
		int[] size = new int[v];
		for(i=0;i<e;i++){
			System.out.println("enter the sourec and destination for the vertex "+(i+1));
			int s = sc.nextInt();
			int d = sc.nextInt();
			g[s][size[s]++] = d;
			g[d][size[d]++] = s;
		}
		int[] list = new int[v];
		System.out.println("enter the starting vertex");
		int start = sc.nextInt();
		dfs(g,size,list,start);
	}
}

// refer here for sample I/O : https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/