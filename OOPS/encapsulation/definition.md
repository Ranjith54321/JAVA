the process of binding properties and behaviour is called encapsulation

the class contains 
	variables
	methods
	constructor
	instance block
	static block          it is called encapsulation

	

	Must read this Doc Has Clear Info : https://www.geeksforgeeks.org/encapsulation-in-java/


	- Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared.
	- As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or the world without providing any details behind implementation using the abstraction concept, so it is also known as a combination of data-hiding and abstraction.


	Let's say We have

	Class Data {
		Name
		Private DOB
		Private Salary

		public setName () {}
		private setDOB () {}
		public setSalary () {}

		public getName () {}
		public getDOB () {}
		private getSalary () {}
	}

	here ,
		with the Data object, 
			anyone can access Name Variable, setName and getName
					can access only getDOB
					can't access DOB and Salary variable, setDOB and getSalary methods
					Why because chek the access Modifiers.




	In this Given Bean class example Refer here : https://stackoverflow.com/questions/1612334/difference-between-dto-vo-pojo-javabeans


	Bean class rules :
		Should have Private properties
		Should have public getters and setters
		Should have default 0-arg constructor. 