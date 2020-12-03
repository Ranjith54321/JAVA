import java.util.Scanner;
class bst1{
	class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	Node tree;
	bst1(){
		tree = null;
	}
	void insert(int n){
			tree = newnode(tree,n);
		}
	Node newnode(Node tree,int n){
		if(tree == null){
			tree = new Node(n);
			return tree;
		}
		if(n < tree.data)
			tree.left = newnode(tree.left,n);
		if(n > tree.data)
			tree.right = newnode(tree.right,n);
		return tree;
	}
	void display(){
		dis(tree);
	}
	void dis(Node tree){
		if(tree==null)
			return;
		dis(tree.left);
		System.out.print(tree.data+" ");
		dis(tree.right);
	}
	void delete(int n){
		tree = del(tree,n);
	}
	Node del(Node tree,int n){
		if(tree.data > n)
			tree.left = del(tree.left,n);
		if(tree.data < n)
			tree.right = del(tree.right,n);
		else{
			if(tree.left == null || tree.right == null){
				if(tree.right==null)
					return tree.left;
				else
					return tree.right;
			}
			else{
				Node t = findsmall(tree.right);
				tree.data = t.data;
				t.right = del(tree.right,t.data);
			}
		}
		return tree;
	}
	Node findsmall(Node tree){
		Node p = tree;
		while(p!=null && p.left!=null){
			p = p.left;
		}
		return p;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bst1 t = new bst1();
		//t.Node root = null;
		System.out.println("1.)insert 2.) delete 3.) display 4.) exit");
		while(true){
			System.out.println("enter the choice");
			int ch = sc.nextInt();
			switch(ch){
				case 1:{
					System.out.println("enter the number to insert");
					int n =sc.nextInt();
					t.insert(n);
					break;
				}
				case 2:{
					System.out.println("enter the number to delete");
					int n =sc.nextInt();
					t.delete(n);
					break;
				}
				case 3:{
					System.out.println("data in the tree");
					t.display();
					break;
				}
				case 4:
					System.out.println("bye");
					return;
			}
		}
	}
}