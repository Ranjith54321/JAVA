package PlayGround;

public class Parent {
    static {
        System.out.println("Parent static block");
    }

    // insance block
    {
        System.out.println("Parent insance block");
    }
    Parent() {
        System.out.println("Parent constructor");
    }

    void m1() {
        System.out.println("Parent m1");
    }
}

class Child extends Parent {
    static {
        System.out.println("child static block");
    }

    // insance block
    {
        System.out.println("child insance block");
    }
    Child() {
        //this(0);
         System.out.println("child constructor");
    }
     Child(int a) {
        //super(10);
         System.out.println("child 1 arg constructor");
    }
     void m1() {
        System.out.println("child m1");
    }
    public static void main(String[] args) {
        //Parent p = new Parent();
        Child c = new Child();
        // c.m1();

    }
}

/*

Output :
    Parent static block
    child static block
    Parent insance block
    Parent constructor
    child insance block
    child constructor
*/