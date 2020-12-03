import java.util.Scanner;
// here no need to import that user defined exception class bcoz both are in same folder 
class Test{
	static void marriage(int age) {
		if(age < 20 ){
			System.out.println("not ready" );
			throw new InvalidAgeException("small boy and study");
		}
		else
			System.out.println("ready to get girl");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		marriage(age);
	}
}

// as you know this is checked exception so we need to handle it

// either you can handle using try-catch or throws

op :

F:\java\Exception_handling\throw\ex4>java Test
enter the age
12
not ready
Exception in thread "main" InvalidAgeException: small boy and study
        at Test.marriage(Test.java:7)
        at Test.main(Test.java:16)

F:\java\Exception_handling\throw\ex4>java Test
enter the age
21
ready to get girl
