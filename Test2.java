import java.io.*;
import java.util.*;
import java.lang.*;
class Test2{
	public static String find(String x){
		String[] s = x.split("\\s"); 
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length;i++){
			int n = s[i].length();
			StringBuffer odd = new StringBuffer();
			StringBuffer even = new StringBuffer();
			StringBuffer one = new StringBuffer();
			for(int j=0;j<n;j++){
				if((j+1)%2==0)
					even.append(s[i].charAt(j));
				else
					odd.append(s[i].charAt(j));
			}
			one.append(odd);
			one.append(even);
			if(i!=s.length-1)
				sb.append(one+" ");
			else
				sb.append(one);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		System.out.println(find(s));
	}
}