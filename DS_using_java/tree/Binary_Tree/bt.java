import java.util.LinkedList;
import java.util.Queue;
import java.lang.*;
import java.io.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}
class BinaryTree{
	// 1. Insert :
	public Node insert(Node root,int data){
		if(root == null)
			return new Node(data);
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node n = queue.poll();
			if(n.left == null){
				n.left = new Node(data);
				break;
			}else{
				queue.add(n.left);
			}
			if(n.right == null){
				n.right = new Node(data);
				break;
			} else{
				queue.add(n.right);
			}
		}
		return root;
	}

	// 2. Display :
	public void display(Node root){
		if(root == null){
			System.out.println("Emoty tree....");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node n = queue.poll();
			System.out.print(n.data+" ");
			if(n.left!=null)
				queue.add(n.left);
			if(n.right!=null)
				queue.add(n.right);
		}
	} 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Node root = null;

		BinaryTree bt = new BinaryTree();

		System.out.println("Select the Option below \n1.Insert 2.Displat 3.Exit\n");
		int ch;
		do{
			ch = Integer.parseInt(br.readLine());
			switch(ch){
				case 1:
					System.out.println("Enter the Data");
					int data = Integer.parseInt(br.readLine());
					root = bt.insert(root,data);
					break;
				case 2:
					System.out.println("Data in the Tree");
					bt.display(root);
					break;
				case 3:
					System.out.println("Bye..");
					break;
				default:
					System.out.println("Enter the option 1 to 3");
			}
		}while(ch!=3);
	}
}