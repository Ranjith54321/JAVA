/*
	See the Git hub readme file before reading this.

*/

import java.util.*; // code is same like GFG
import java.io.*;

class Edge implements Comparable<Edge>{ // here Arrays.sort() will use this comparator.
	int src,des,weight;
	Edge(int src,int des,int weight){
		this.src = src;
		this.des = des;
		this.weight = weight;
	}

	public int compareTo(Edge compareEdge){
		return this.weight - compareEdge.weight; 
	}
}
class Subset{
	int parent;
	int rank;
	Subset(int parent){
		this.parent = parent;
		rank = 0;
	}
}
class Main{
	public static int find(Subset[] subset,int i){
		if(subset[i].parent != i)
			subset[i].parent = find(subset,subset[i].parent);
		return subset[i].parent;
	}

	public static void union(Subset[] subset,int x,int y){
		if(subset[x].rank > subset[y].rank){
			subset[y].parent = x;
		} else if(subset[x].rank < subset[y].rank){
			subset[x].parent = y;
		} else{
			subset[y].parent = x;
			subset[x].rank++;
		}
	}
	public static void printMST(int V,int E,Edge[] edges){ // Minimum Spanning Tree Using Krushkal's Algorithm
		// 1.) Sorthe Edge array Based on Weight
		Arrays.sort(edges); // to sort this class base on weight we are using comparable interface, here weight is premitive so comparable is Enough

		// 2.) We need perfom Union by Rank and Path compression Algorithm So create the Subset calss with parent and rank 
		// intially parent is same
		// rank is 0
		Subset[] subset = new Subset[V];
		for(int i=0;i<V;i++)
			subset[i] = new Subset(i);

		// 3.) Find minimum possible (v-1) edges from the Edge array (Because to visi one veryex to another vertex one edges Enough)
		// create one Edge array for final Ans
		Edge[] result = new Edge[V-1];

		int e=0,i=0;
		while(E>V && e<(V-1) && i<V){
			Edge current_edge = edges[i++];

			int x = find(subset,current_edge.src);
			int y = find(subset,current_edge.des);

			if(x!=y){ // if it is not forming Cycle then only we are adding otherwise check next edge.
				result[e++] = current_edge;
				union(subset,x,y);
			}
		}

		if(e == (V-1)){
			int pathLength = 0;
			System.out.println("== Path :  ==");
			System.out.println("== Source :    |   Destination:   Weight  ==");
			for(i=0;i<e;i++){
				Edge edg = result[i];
				System.out.println("== "+edg.src+  "     |    "+ edg.des+"           "+edg.weight);
				pathLength += edg.weight;
			}
			System.out.println("== Total Path Length :  =="+pathLength);
		} else{
			System.out.println("== No Shortest Path Found...............:) ==");
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Vertices and Edges : ");
		int v = sc.nextInt();
		int e = sc.nextInt();

		Edge[] edges = new Edge[e];

		for(int i=0;i<e;i++){
			System.out.println("Enter the Source, Destination and Weight of the Graph : ");
			int src = sc.nextInt();
			int des = sc.nextInt();
			int weight = sc.nextInt();

			edges[i] = new Edge(src,des,weight);
		}


		printMST(v,e,edges);

	}
}