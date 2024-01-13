public class Cons {
    Cons(int a) {
        System.out.println("1 arg cons");
    }
    public static void main(String[] args) {
        new Cons();
    } // here it will cause error because we have only 1-arg constructor. So our object should be 1-arg constructor.
}

// Eg: 2

public class Cons {
    Cons() {
        System.out.println("0 arg cons");
    }
    Cons(int a) {
        System.out.println("1 arg cons");
    }
    public static void main(String[] args) {
        new Cons();
    } // now it will not cause issue because we have 0-arg constructor.
}
