/*
        Union by Rank and Path Copression Algorithm.

        1) The application is to check whether a given graph contains a cycle or not. 

2.) Union-Find Algorithm can be used to check whether an undirected graph contains cycle or not. 

--> Note that we have discussed an algorithm to detect cycle. ... 

 If both the vertices are in the same subset, a cycle is found.

3.) One Important Thing here you have to Notice :
       That is in both cases we are searching deepest parent but here in this algorithm while searching parent we are doing one more extra thing,
    
              int find(subset[] subsets, int i)
          {
              if (subsets[i].parent != i)
                  subsets[i].parent = find(subsets, subsets[i].parent); // here we are updating the parent of the searching element.
              return subsets[i].parent;
          }
          
       Eg : 
       
                              9
                         /    |    \  
                        4     5      6
                     /     \        /  \
                    0        3     7    8
                            /  \
                           1    2  
                           
                  In this example while searching 3 we are updating 3's parent as 9 so that it will reduce the searching time. (see below updated tree diagram)
                  
                              9
                       /    /  \    \
                      4    5    6     3  (-> 3 is here now 3's parent is 9 not 4) because 9 is 3 is deepest parent.
                     /         /  \  /  \
                    0         7    8 1   2
          
          
4.) In Union we are combining the elements by creating parent node with the helo of rank,
                 -> Initially all node's rank is 0. you can take any one of the node as parent and keep the rule till the end. 
                                     and increment the rank if both rank are equal.


*/

import java.util.*;
class Edge{
    int src,des;
    Edge(int src,int des){
        this.src = src;
        this.des = des;
    }
}
class Subset{
    int parent,rank;
    Subset(int v,int rank){
        parent = v;
        this.rank = rank;
    }
}
class Main
{
    // Find util it meets the -1
    int find(Subset[] subset,int i){
        if(subset[i].parent != i)
            subset[i].parent = find(subset,subset[i].parent); // see the github readme file for better understading
        return subset[i].parent;
    }
    
    // Union
    void union(Subset[] subset,int x,int y){
        if(subset[x].rank < subset[y].rank)
            subset[x].parent = y;
        else if(subset[x].rank > subset[y].rank)
            subset[y].parent = x;
        else{
            subset[x].parent = y;
            subset[y].rank++;
        }
    }
    
    boolean isCyclic(Edge[] edges,int v){
       Subset[] subset = new Subset[v];
       
       // Intialize parent to itself and rank as 0
       for(int i=0;i<v;i++){
           Subset ss = new Subset(i,0);
           subset[i] = ss;
       }
       
       
       for(int i=0;i<edges.length;i++){
            // find 
            Edge edg = edges[i];
            int x = find(subset,edg.src);
            int y = find(subset,edg.des);
            
            if(x==y)
                return false;
            // Union
            union(subset,x,y);
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
