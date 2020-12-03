import java.util.Scanner;
class LinkedList{
	Node head;  // this is head node
	static class Node{ // static nested class
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public static LinkedList insert(LinkedList list,int d){
		Node new_node = new Node(d);
		if(list.head==null){
			list.head = new_node;
			return list;
		}
		else{
			Node p = list.head;

			while(p.next!=null){
				p = p.next;
			}
			p.next = new_node;
		}
		return list;
	}

	public static void disp(LinkedList list){
		Node p = list.head;
		while(p!=null){
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println();
	}

	public static LinkedList del(LinkedList list,int d){
		Node p = list.head;
		Node prev = null;
		if(p==null){
			System.out.println("LinkedList is empty");
			return list;
		}
		if(d==(list.head.data)){
			list.head = p.next;
		}
		else{
			while(p!=null){
				if(d==p.data)
					break;
				prev = p;
				p = p.next;
			}
			prev.next = p.next;
		}
		return list;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. insert  2. display  3. delete 4.exit");
		while(true){
			System.out.println("Enter the choice");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter the data to insert");
					int d = sc.nextInt();
					list = insert(list,d);
					break;
				case 2:
					System.out.println("available data ");
					disp(list);
					break;
				case 3:
					System.out.println("Enter the data to delete");
					int n = sc.nextInt();
					list = del(list,n);
					break;
				case 4:
					//exit(0);
					return;
					//break;
			}
		}// while

	}
}