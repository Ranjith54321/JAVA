# Functional Interface:
// See in Notion
Resource: Video: https://www.youtube.com/watch?v=YXRBBOjgrFU

## Over View

- What is Functinal Interface
- What is Lambda Expression
- How to use Function Interface with Lambda expression
- Advantage of Function Interface
- Types of Functional Interface
	- Consumer
	- Supplier
	- Function
	- Predicate
- How to handle use case when Functional Inteface extends from other Interface(or Functional Interface)?


## 1. What is Functinal Interface
	- In Functional interface only one abstract method, but we can have other methods like dafult mthod, static mthod or other methods inherted from the Object class.
	- Also know as ASM (Single Abstract Method)
	- @FunctionalInterface keyword can be used at top of the interface (But it is optional).

	ex: 1
```java
	public interface Bird { // allowed 
		void canFly(String val); // note: by default method is public abstract in interface.
	}

```
	ex: 2
```java
	public interface Bird { // allowed 
		void canFly(String val); 
		default void getHeight() {
			// default method implementation	
		}
		static void canEat() {
			// static method implementation	
		}
		String toString(); // Object Class Method.
	}

```

	ex: 3
```java
	public interface Bird { // Not Allowed.
		void canFly(String val); 
		boolean canBreath(String name);
	}

```

	ex: 4
```java
	@FunctionalInterface
	public interface Bird { // Allowed.
		void canFly(String val); 
	}

```

### Use of @FunctionalInterface:
	@FunctionalInterface will restrict the user to use More than one abstract method in the interface. If you are wiriting the one more abstract method means it will thorugh the error.


## Different way of Implementing the interface methods:

## Method 1: by extending and overriding the abstract method.
```java
@FunctionalInterface
public interface Bird {
		void canFly(String val); 
}

clas Main implements Bird {
	void canFly(String s) {
		System.out.println("bird can fly");
	}
	public static void main(String[] args) {
		new Main().canFly("eagle");
	}
}

``` 

## Method 2: using Anonymous Inner class. 
```java
@FunctionalInterface
public interface Bird {
		void canFly(String val); 
}

clas Main extends Bird {
	public static void main(String[] args) {
		Bird eagleObject = new Bird() {
			@Override
			public void canFly(String s) {
				System.out.println("bird can fly");
			}
		}
	};
	eagleObject.canFly("vertical");
}

``` 

## Method 3: Using Lambda Expression: -> Need rework here only.
**The Only Use case for the Lambda Expression is to implement the Functional Interface.**
```java
@FunctionalInterface
public interface Bird { // TODO: check this it wont work like this.
		void canFly(String val); 
}

clas Main implements Bird {
	public static void main(String[] args) {
		Bird eagleObject = (String s) -> System.out.println("bird can fly"); 
		//Bird eagleObject = () -> {System.out.println("bird can fly");}; // if it is multiple line we can use the Block {}, like this
		eagleObject.canFly("vertical");
}

``` 

# What is Lambda Expression;
	- Lambda Expressio is way to implement Functional Interface. It used to avoid the verbose (unwanted code / boiler plate code).
	- Lambda expression is used to avoid the Verbose (Means, extra unwated codes / Implemenatation). It makes simple and focus on the business logic.


Now, We know what is functional interface, what is lambda expression and how to use it.

## Types of Functional Interface available in java:
	Note: Thes are internal functionality provided by java. If we want custom Functional Interface We can create like above implementation.
	Types of Functional Interface
	- Consumer
	- Supplier
	- Function
	- Predicate

	all are present in package: java.util.function;

### 1. Consumer:
	- Represent an operation, that accept a single input parameter and returns no result.

```java
	@FunctionalInterface
	public interface Consumer<T> { // No need to implement this, this will be available in java.util.function, here implemented for referrence.
		void accept(T t); // t is Type which going to accept.
	}

	public class public static void main(String[] args) {
		public static void main(String[] args) {
			Consumer<Integer> logObject = (Integer val) -> { // The Funtional Interface Name (Consumer) along with argument type should be metioned.
				if(val>10) {
					System.out.println("val > 10");
				}
			};

			logObject.accept(11); // call accept method // Internal method of Consumer Functional Interface
		}
	}
```

### 2. Supplier:
	- Represent an operation, that don't input parameter but returns result.

```java
	@FunctionalInterface
	public interface Supplier<T> {
		T get();
	}

	public class public static void main(String[] args) {
		public static void main(String[] args) {
			Supplier<String> getString = () -> "return this String";

			System.out.println(" res : " + getString.get()); // call get method // Internal method of Supplier Functional Interface
		}
	}
```

### 3. Function:
	- Represent an operation, that accept a sone argument process it and produces a result.

```java
	@FunctionalInterface
	public interface Function<T, R> { // T -> arugument type, R-> return type.
		R apply(T t);
	}

	public class public static void main(String[] args) {
		public static void main(String[] args) {
			Function<Integer, Boolean> isEven = (Integer n) -> {
				if(n%2 == 0)
					return true;
				return false;
			};

			System.out.println(" isEven : " + isEven.apply(2)); // call apply method // Internal method of Function Functional Interface
		}
	}
```

### 4. Predicate:
	- Represent an operation, that accept a sone argument and returns a boolean.

```java
	@FunctionalInterface
	public interface Predicate<T> { // T -> arugument type
		boolean test(T t);
	}

	public class public static void main(String[] args) {
		public static void main(String[] args) {
			Predicate<Integer> isEven = (Integer n) -> {
				if(n%2 == 0)
					return true;
				return false;
			};

			System.out.println(" isEven : " + isEven.test(2)); // call test method // Internal method of Predicate Functional Interface
		}
	}
```

### 5. All in one:
```java
public class Test2 {
    public static void main(String[] args) {

        Consumer<Integer> consumer = (Integer n) -> System.out.println("Consumer n : " + 10);
        Supplier<Integer> supplier = () -> {return 10;};
        Supplier<Integer> supplier2 = () -> 11;
        Function<Integer, String> function = (Integer n) -> n+" number";
        Predicate<Integer> predicate = (Integer n) -> n>0;

        consumer.accept(10);
        System.out.println(" supplier1 : " + supplier.get());
        System.out.println(" supplier2 : " + supplier2.get());
        System.out.println(" function : " + function.apply(10));
        System.out.println(" predicate : " + predicate.test(1));
    }
}
```

## How to handle use case when Functional Inteface extends from other Interface(or Functional Interface)?

### Case 1: Funtional Interface extending Non Functional interface:

 === Not Valid : 
```java
public interface LivingThings {
	 public void canBreath();
}
@FunctionalInterface // gove error
public interface Bird extends LivingThings { // Now we have 2 Abstract methods.
	void canFly(String val);
}
```
=== Valid :

```java
public interface LivingThings {
	default public boolean canBreath() { // It is a default methos not problem.
		return true;
	}
}
@FunctionalInterface
public interface Bird extends LivingThings { // It is valid we have only one Abstract method.
	void canFly(String val);
}
```

### Case 2: Interface extending Funtional Functional interface:

Valid:
```java
@FunctionalInterface
public interface LivingThings { // Only one Abstract method.
	 public void canBreath();
}
public interface Bird extends LivingThings { // Its non FunctionalInterface so, no problem, even it is 2 Abstract method.
	void canFly(String val);
}
```

### Case 3: Funtional Interface extending other Funtional Functional interface:

Not Valid;

```java
@FunctionalInterface
public interface LivingThings { // Only one Abstract method.
	 public void canBreath();
}
@FunctionalInterface
public interface Bird extends LivingThings { // Its FunctionalInterface so, 2 Abstract method not allowed.
	void canFly(String val);
}
```

Valid: **SEE**

```java
@FunctionalInterface
public interface LivingThings { // Only one Abstract method.
	 public boolean canBreath();
}
@FunctionalInterface
public interface Bird extends LivingThings { // if Both Abstract method are same. Then, No problem. Signature must be same.
	public boolean canBreath();
}

public class Main {
	public static void main(String[] args) {
		Bird bird = () -> true;
		System.out.println("res : " + bird.canBreath());
	}
}
```




