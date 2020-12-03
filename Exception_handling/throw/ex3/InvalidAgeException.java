class InvalidAgeException extends Exception{
	// default 1 arg constructor
	InvalidAgeException(String str){
		super(str); // we need to pass it to super class of Exception i,e. Exception class
	}           /// that is going to print exception message for us
}