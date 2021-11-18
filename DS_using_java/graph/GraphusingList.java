/*
 here there is no weight only source and destination. it is a un-directed Graph 

 If you want to add weight then you have to create one more data field in Node called weight.
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
class Main
{
    public static void add(Node[] g,int s,int d){
        for(int i=0;i<g.length;i++){
            if(i==s){
                Node newNode = new Node(d);
                if(g[i]==null){
                    g[i] = newNode;
                } else{
                    Node p = g[i];
                    while(p.link!=null)
                        p = p.link;
                    p.link = newNode;
                }
            } 
            
            if(i==d){
                Node newNode = new Node(s);
                if(g[i]==null){
                    g[i] = newNode;
                } else{
                    Node p = g[i];
                    while(p.link!=null)
                        p = p.link;
                    p.link = newNode;
                }
            }
        }
    }
    public static void print(Node[] g){
        for(int i=0;i<g.length;i++){
            Node p = g[i];
            if(p!=null){
                System.out.print("i : "+i+"==> ");
                
                while(p!=null){
                    System.out.print(p.data+"-> ");
                    p = p.link;
                }
                System.out.println();
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of vertices and Edges : ");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Node[] graph = new Node[v];
		
		for(int i=0;i<e;i++){
		    System.out.println("Enter the source and  destination : ");
		    int s = sc.nextInt();
		    int d = sc.nextInt();
		    
		    add(graph,s,d);
		}
		
		System.out.println("After insertion : ");
		print(graph);
	}
}