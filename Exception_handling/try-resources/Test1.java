import java.util.Scanner;
class Test1{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){ 
		//try(Scanner sc = new Scanner(System.in);){ // both are valid 	
			//Thread.sleep(1000);
			System.out.println("Enter the Number");
			int n = sc.nextInt();
			//System.out.println("you entered : "+10/n);
		}
	}
}

/*this is un-checed Exception so you no need to write catch block

op :

F:\java\Exception_handling\try-resources>java Test1
Enter the Number
2
you entered : 2*/

try with esources  not going to perform any Exception handling work 

you can uncommand the sleep and 10/0 to check the diff 