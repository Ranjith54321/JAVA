/*
    This contains both DFS and BFS traversals

*/


import java.util.*;
class Node{
    int data;
    Node left;
    Node(int data){
        this.data = data;
        left = null;
    }
}
public class Main
{
    // 1.Insert
    public static void insert(Node[] graph,int v,int s,int d){
        for(int i=0;i<v;i++){
            if(s==i){
                Node t = new Node(d);
                if(graph[i]==null)
                    graph[i] = t;
                else{
                    Node p = graph[i];
                    while(p.left!=null)
                        p = p.left;
                    p.left = t;
                }
            }
            
            if(d==i){
                Node t = new Node(s);
                if(graph[i]==null)
                    graph[i] = t;
                else{
                    Node p = graph[i];
                    while(p.left!=null)
                        p = p.left;
                    p.left = t;
                }
            }
        }
    }
    
    // 2. Normal Print of the Graph
    public static void print(Node[] graph,int v){
        for(int i=0;i<v;i++){
            Node p = graph[i];
            System.out.print(i+" :");
            while(p!=null){
                System.out.print(" -> "+p.data);
                p = p.left;
            }
            System.out.println();
        }
    }
    
    // 3. BFS 
    public static void BFS(Node[] graph,int v,int start){
        int[] visited = new int[v];
        int[] queue = new int[v];
        int f=0,r=0;
        queue[r++] = start;
        
        while(f!=r){
            start = queue[f++];
            visited[start] = 1;
            System.out.print(start+" ");
            Node p = graph[start];
            while(p!=null){
                if(visited[p.data] == 0)
                    queue[r++] = p.data;
                p = p.left;
            }
        }
        System.out.println();
    }
    
    // 4.DFS 
    public static void DFS(Node[] graph,int start,int[] visited){
        System.out.print(start+" ");
        visited[start] = 1;
        Node p = graph[start];
        while(p!=null){
            if(visited[p.data] == 0)
                DFS(graph,p.data,visited);
            p = p.left;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no of Vertices and Edges  : ");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Node[] graph = new Node[v];
		
		// insert
		for(int i=0;i<e;i++){
		    System.out.println("Enter the Source and Destination  : ");
		    
		    int s = sc.nextInt();
		    int d = sc.nextInt();
		    
		    insert(graph,v,s,d);
		}
		
		// Normal print
		System.out.println("Normal Printing of thr Graph : ");
		print(graph,v);
		
		// BFS 
		System.out.println("-------------------------------------");
		System.out.println("Normal Printing of thr Graph : ");
		BFS(graph,v,1);
		
		// DFS 
		System.out.println("-------------------------------------");
		System.out.println("Normal Printing of thr Graph : ");
		int[] visited = new int[v];
		DFS(graph,1,visited);
		
	}
}