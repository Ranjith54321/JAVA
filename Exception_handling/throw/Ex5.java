import java.util.Scanner;
class Ex5{
	static void m1(int n){
		if(n<20)
			throw new ArithmeticException("ithu than thavarana visayam");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		m1(age);
	}
}