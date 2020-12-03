import java.util.Map;
import java.util.HashMap;
import java.io.*;

class Tri{
	class trinode{
		Map<Character,trinode> child;
		boolean ew;
		trinode(){
			child = new HashMap<>();
			ew = false;
		}
	}
	trinode root;
	Tri(){
		root = new trinode();
	}
	void insert(String word){
		trinode curr = root;
		for (int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			trinode node = curr.child.get(ch);
			if(node==null){
				node = new trinode();
				curr.child.put(ch,node);
			}
			curr = node;
		}
		curr.ew = true;
	}
	boolean search(String word){
		trinode curr = root;
		for (int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			trinode node = curr.child.get(ch);
			if(node==null)
				return false;
			curr = node;
		}
		return curr.ew;
	}
	void delete(String word){
		delrec(root,word,0);
	}
	boolean delrec(trinode curr,String word,int index){
		if(index == word.length()){
			if(!curr.ew){
				return false;
			}
			curr.ew = false;

			return curr.child.size() == 0;
		}

		char ch = word.charAt(index);
		trinode node = curr.child.get(ch);
		if(node==null)
			return false;
		boolean todel = delrec(node,word,index+1);
		if(todel){
			curr.child.remove(ch);
			return curr.child.size() == 0;
		}
		return false;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Trie t = new Trie();
        //t.Node root = null;
        System.out.println("1.)insert 2.) delete 3.) search 4.) exit");
        while(true){
            System.out.println("enter the choice");
            //int ch = sc.nextInt();
            int ch = Integer.parseInt(br.readLine());
            switch(ch){
                case 1:{
                    System.out.println("enter the string to insert");
                    //String s = sc.nextLine();
                    String s = br.readLine();
                    t.insert(s);
                    break;
                }
                case 2:{
                    System.out.println("enter the strin to delete");
                    //String s = sc.nextLine();
                    String s = br.readLine();
                    t.delete(s);
                    break;
                }
                case 3:{
                    System.out.println("enter the strin to search");
                    //String s = sc.nextLine();
                    String s = br.readLine();
                    System.out.println("is avilable : "+t.search(s));
                    break;
                }
                case 4:
                    System.out.println("bye");
                    return;
            }
        }
	}
}