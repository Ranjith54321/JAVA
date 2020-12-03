import java.io.*;
import java.util.*;
import java.lang.*;
class Test{
	public static String find(String x){
		//int n = s.length();
		String[] s = x.split("\\s"); 
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length;i++){
			int n = s[i].length();
			StringBuffer tsb = new StringBuffer();
			for(int j=0;j<n;j++){
				int c = (int)s[i].charAt(j);
				
				if(c>=65 && c<=90){
					if((c+n) <= 90)
						tsb.append((char)(c+n));
					
					else
						tsb.append('Z');
					
				}// for capital letters

				if(c>=97 && c<=122){
					if((c+n) <= 122)
						tsb.append((char)(c+n));
					
					else
						tsb.append('z');
					
				}// for small letters
			}
			if(i!=s.length-1)
				sb.append(tsb+" ");
			else
				sb.append(tsb);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		System.out.println(find(s));
	}
}