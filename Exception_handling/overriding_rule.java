// Below all are based on overrinding the parent method. If child is using different method then no issues.


Rule : 1  if parent class not contains any exception the child class can thorw only un-checked exception

case  : 1

class parent{
	void m1(){}
}
class child extends parent{
	void m1() throws ArithmeticException{

	}
}

case : 2
if parent class not contains any exception if the child class thorws only checked exception then it shows Error 


class parent{
	void m1(){}
}
class child extends parent{
	void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
}

op :

overriding_rule.java:21: error: m1() in child cannot override m1() in parent
        void m1() throws InterruptedException{
             ^
  overridden method does not throw InterruptedException
1 error

Rule 2 : //------------------------- Rule 2 -------------------------/

if parent throws Exception but child not throws any Exception is valid

case 3 : 

class parent { // any exception
	void m1()throws InterruptedException{}// any exception
}
class child extends parent{
	void m1() {
	}
}

case 4 :
	if parent and child throws same Exception no error 

class parent { 
	void m1()throws InterruptedException{}// any exception
}
class child extends parent{
	void m1() throws InterruptedException{
	}
}

case 5 :

if parent class method throws Parent Exception and in child class method throws child class Of exception not problem

class parent { 
	void m1()throws Exception{}
}
class child extends parent{
	void m1() throws InterruptedException{
	}
}


case 5 :

if parent class method throws child class of  Exception and in child class method throws  Exception there is problem

class parent { 
	void m1()throws InterruptedException{}
}
class child extends parent{
	void m1() throws Exception{
	}
}

op :

overriding_rule.java:81: error: m1() in child cannot override m1() in parent
        void m1() throws Exception{
             ^
  overridden method does not throw Exception
1 error
