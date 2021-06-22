import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
class Node{
	int data;
	Node left,right;

	Node(int data){
		this.data = data;
		left = right = null;
	}
}
class BST{
	// insertion : 
	public Node insert(Node root, int data, Queue<Node> q){
		
	}
	// print : 


	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Node node = null;

		BT b = new BT();

		System.out.println("Enter the Choice \n 1.) Insert  2.) Print 3.) Exit\n");
		
		do{
			System.out.println("enter the choice");
			ch = Integer.parseInt(br.readLine().trim());

			switch(ch){
				case 1 :{
					System.out.println("Please Enter the Number\n");
					int data = Integer.parseInt(br.readLine().trim());
					node = m.insert(node,data);
					break;
				}
				case 2 :{
					System.out.println("The Binary Tree is \n");
					m.print(node);
					break;
				}
				case 3 : {
					System.out.println("Byeeee\n");
				}
			}
		}while(ch!=3);
	}
}