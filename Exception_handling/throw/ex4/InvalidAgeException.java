class InvalidAgeException extends RuntimeException{
	// default 1 arg constructor
	InvalidAgeException(String str){
		super(str); // we need to pass it to su[er class of Exception i,e. Exception class
	}           /// that is going to print exception message for us
}