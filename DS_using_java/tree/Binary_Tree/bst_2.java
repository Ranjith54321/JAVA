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
public class Main{
	// insertion : 
	public Node insert(Node root, int data){
		if(root == null)
			return new Node(data);

		Node t = root;
		Node p = t;
		while(t!=null){
			p = t;
			if(t.data < data)
				t = t.right;
			else if(t.data > data)
				t = t.left;
			else{
				System.out.println("Duplicate Not allowed .... ");
				return root;
			}
		}
		if(p.data < data)
			p.right = new Node(data);
		else
			p.left = new Node(data);
		return root;
	}
	// print : 
	public void print(Node root){ // pre order
		if(root == null)
			return;
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}

	public Node findMin(Node root){
		while(root!=null && root.left!=null)
			root = root.left;
		return root;
	}
	public Node delete(Node root,int data){
		if(root == null)
			return null;
		if(root.data < data)
			root.right = delete(root.right,data);
		else if(root.data > data)
			root.left = delete(root.left,data);
		else{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else{
				Node rightSmall = findMin(root.right);
				root.data = rightSmall.data;

				root.right = delete(root.right,rightSmall.data);
			}
		}
		return root;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Node root = null;

		Main m = new Main();

		System.out.println("Enter the Choice \n 1.) Insert  2.) Print 3.) Exit\n");
		int ch;
		do{
			System.out.println("enter the choice");
			ch = Integer.parseInt(br.readLine().trim());

			switch(ch){
				case 1 :{
					System.out.println("Please Enter the Number\n");
					int data = Integer.parseInt(br.readLine().trim());
					root = m.insert(root,data);
					break;
				}
				case 2 :{
					System.out.println("The Binary Tree is \n");
					m.print(root);
					System.out.println();
					break;
				}
				case 3:{
					System.out.println("Please Enter the Number to delete \n");
					int data = Integer.parseInt(br.readLine().trim());
					root = m.delete(root,data);
					m.print(root);
					break;
				}
				case 4 : {
					System.out.println("Byeeee\n");
					break;
				}
				default : System.out.println("Please Enter the Correct Choice...\n");
			}
		}while(ch!=4);
	}
}