package Basics;

class A {
    public A() {
        System.out.println("Constructor in class A");
    }
    public A(int x) {
        System.out.println("Constructor in class A with parameter: " + x);
    }
}

class B extends A {
    public B() {
        System.out.println("Constructor in class B");
    }
    public B(int x) {
        this();
        System.out.println("Constructor in class B with parameter: " + x);
    }
}

// this() - Executes constructor of same class
//super() - Executes constructor of super (parent) class

public class SuperMethod {
    public static void main(String[] args) {

        B obj = new B(10);

    }
}
