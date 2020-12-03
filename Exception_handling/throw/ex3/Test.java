import java.util.Scanner;
// here no need to import that user defined exception class bcoz both are in same folder 
class Test{
	static void marriage(int age) throws InvalidAgeException{
		if(age < 20 ){
			System.out.println("not ready" );
			throw new InvalidAgeException("small boy and study");
		}
		else
			System.out.println("ready to get girl");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("enter the age");
		int age = sc.nextInt();
		marriage(age);
		}
		catch(InvalidAgeException i){
			System.out.println(i);

		}
	}
}

// as you know this is checked exception so we need to handle it

// either you can handle using try-catch or throws

F:\java\Exception_handling\throw\ex3>java Test
enter the age
12
not ready
InvalidAgeException: small boy and study           <------- see here message

F:\java\Exception_handling\throw\ex3>java Test
enter the age
21
ready to get girl
