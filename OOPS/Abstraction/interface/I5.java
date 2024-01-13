interface Inter1 {
    void m1();
}

interface Inter2 {
    void m1();
    void m2();
}

interface Inter3 extends Inter1,Inter2 {
    void m3();
}

public class I5 implements Inter3 {
    public void m1() {
        System.out.println("m1 method");
    }
    public void m2() {
        System.out.println("m2 method");
    }
    public void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        Inter3 i = new I5();
        i.m1();
        i.m2();
        i.m3();
    }
}

/*

O/p :

 m1 method
 m2 method
  m3 method
 */
