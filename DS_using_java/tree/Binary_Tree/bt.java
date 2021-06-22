import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
class Node{
	int data;
	Node left,right;

	Node(int data){
	this.data = data;
	left = right = null;
	}
}
class BT{
	public Node insert(Node root,int data){
		if(root == null){
			return new Node(data);
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node n = q.poll();
			if(n.left == null){
				n.left = new Node(data);
				break;
			}else{
				q.add(n.left);
			}
			if(n.right == null){
				n.right = new Node(data);
				break;
			}else{
				q.add(n.right);
			}
		}
		return root;
	}

	public void print(Node root){
		if(root == null){
			System.out.println("No data in the Tree");
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while( !q.isEmpty() ){
			Node n = q.poll();
			if(q!=null){
				System.out.print(n.data + " ");
			}
			if(n.left!=null){
				q.add(n.left);
			}
			if(n.right!=null){
				q.add(n.right);
			}
		}
		System.out.println("\n");
		return;
	}

	public static void main(String[] args) throws Exception{
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Node node = null;
		int ch=0;
		BT m = new BT();
		System.out.println("Enter the Choice \n 1.) Insert  2.) Print 3.) Exit\n");
		
		while(ch!=3){
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
			}
		}
	}
}