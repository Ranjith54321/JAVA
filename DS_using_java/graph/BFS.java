import java.util.*;
class BFS{

	public static void bfs(int[][] g,int[] size,int[] que,int start){
		int f=0,r=0;
		int[] visit = new int[que.length];
		visit[start] = 1;
		que[r++] = start;
		while(f!=r){
			start = que[f++];
			System.out.print(start+"->");
			for (int i=0;i<size[start];i++) {
				if(visit[g[start][i]]==0){
					visit[g[start][i]] = 1;
					que[r++] = g[start][i];
				}
			}
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
		int[] que = new int[v];
		System.out.println("enter the starting vertex");
		int start = sc.nextInt();
		bfs(g,size,que,start);
	}
}

// refer here for sample I/O : https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
// in this above link eaxmple is directed graph so the output should be vary