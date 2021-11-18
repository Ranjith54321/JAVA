import java.util.*;
class Edge{
    int src,des;
    Edge(int src,int des){
        this.src = src;
        this.des = des;
    }
}
class Main
{
    // Find util it meets the -1
    int find(int[] parent,int n){
        if(parent[n]==-1)
            return n;
        return find(parent,parent[n]);
    }
    
    // Union
    void union(int[] parent,int x,int y){
        parent[x] = y;
    }
    
    boolean isCyclic(Edge[] edges,int v){
        int[] parent = new int[v];
        
        //Initially all of the vertoces parents are '-1'
        for(int i=0;i<v;i++)
            parent[i] = -1;
            
        // Apply Find then Union all the Edges of the Graph
        for(int i=0;i<edges.length;i++){
            Edge edg = edges[i];
            
            // 1. find
            int x = find(parent,edg.src);
            int y = find(parent,edg.des);
            
            if(x==y)
                return false;
            
            // 2. union
            union(parent,x,y);
        }    
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of vertices and Edges : ");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		// create array of Edges;
		Edge[] edges = new Edge[e];
		for(int i=0;i<e;i++){
		    System.out.println("Enter the src and des of the Edge : ");
		    int src = sc.nextInt();
		    int des = sc.nextInt();
		    
		    Edge edg = new Edge(src,des);
		    edges[i] = edg;
		}
		
		Main obj = new Main();
		if(obj.isCyclic(edges,v))
		    System.out.println("No Cycle.....X.....");
		else    
		    System.out.println("Cycle......");
	}
}