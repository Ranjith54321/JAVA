/*
	This is Strictly for undirected graph :


	If you want graph to be Euler Circut then,

	1.) The Graph should contains Euler Path
	
	2.) The starting and Ending vertex of the graph should be same.


	Euler Path 
		  The Euler Path in a graph is that the all the Edges of the graph should visit exactly only once.

	Tip for Euler Path : 

    [This is important for for Euler ]
    
	It can contain 0 or 2 odd degree vertex [ Note : 0 means nothins otherwise exactly two odd degree vertex]

	For Eulerian circuit :

	It should be Euler Path, also all the vertex should have Even degree [Note 0 also even]


	if this code is not clear for you then visit Geeks for Geeks


*/
import java.util.*;
class Node{
	int data;
	Node link;
	Node(int data){
		this.data = data;
		link = null;
	}
}

class Main{
	public static void addEdge(Node[] g,int src, int des,int v){
		for(int i=0;i<v;i++){
			if(i==src){
				Node t = new Node(des);
				Node p = g[i];
				if(p==null){
					g[i] = t; 
				}else {
					while(p.link!=null)
						p = p.link;
				p.link = t;
				}
				
			} else if(i==des){
				Node t = new Node(src);
				Node p = g[i];

				if(p==null){
					g[i] = t; 
				}else {
					while(p.link!=null)
						p = p.link;
				p.link = t;
				}
			}
		}
	}
	public static void DFS(int start,boolean[] visited,Node[] g){
		visited[start] = true;

		Node p = g[start];
		while(p != null){
			if(!visited[p.data])
				DFS(p.data,visited,g);
			p = p.link;
		}
	}
	public static int size(Node[] g,int i){
		Node p = g[i];
		int sz=0;
		while(p!=null){
			sz++;
			p = p.link;
		}
		return sz;
	}
	public static boolean isConnected(Node[] g,int v){
		// create boolean array for track the connected vertex
		boolean[] visited = new boolean[v];

		// get the non zero dergee vertex
		int i=0;
		for(i=0;i<v;i++){
			if(size(g,i)!=0)
				break;
		}

		// if no degree of the vertex with more than 0 then return

		if(i==v)
			return true;

		// to track the visited items
		DFS(i,visited,g);

		// if un-visited vertex has degree then return false

		for(i=0;i<v;i++){
			if(visited[i] == false && size(g,i)>0)
				return false;
		}

		return true;

	}
	public static int isEulerian(Node[] g,int v){
		if(isConnected(g,v) == false)
			return 0;

		// find odd degree
		int odd=0;

		for(int i=0;i<v;i++){
			if(size(g,i)%2!=0)
				odd++;
		}

		if(odd>2)
			return 0;

		return (odd==2) ? 1 : 2;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Vertex and Edges of the Grapgh");
		int v = sc.nextInt();
		int e = sc.nextInt();

		Node[] graph = new Node[v];

		for(int i=0;i<e;i++){
			System.out.println("Enter the Source and Destination of the Edge "+i);
			int src = sc.nextInt();
			int des = sc.nextInt();

			addEdge(graph, src, des,v);
		}

		if(isEulerian(graph,v)==0)
			System.out.println("No Euler....");
		else if(isEulerian(graph,v)==1){
			System.out.println("has Euler Path");
		} else{
			System.out.println("has Euler cycle");
		}
	}
}