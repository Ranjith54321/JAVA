import java.util.*;
class s1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		/*int i,n;
		n = s.length();
		for(i=0;i<s.length();i++){
			System.out.print((int)(s.charAt(i)));
		}*/
		int i,n,k,j;
		int[] a = new int[26];
		int[] b = new int[26];
		n = s.length();
		for(i=0;i<s.length();i++){
			k = (int)(s.charAt(i));
			if(k>=65 && k<=90)
				a[k-65] = a[k-65]+1;
			if(k>=97 && k<=122)
				b[k-97] = b[k-97]+1;
		}
		/*for(i=0;i<26;i++)
			System.out.print(a[i]);*/

		for(i=n-1;i>=1;i--){
			for(j=0;j<26;j++){
				if(a[j]==i){
					System.out.print((char)(j+65));
					System.out.println(a[j]);
				}
					
			}
			for(j=0;j<26;j++){
				if(b[j]==i){
					System.out.print((char)(j+97));
					System.out.println(b[j]);
				}
					
			}
		}

	}
}