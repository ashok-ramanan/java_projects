package Basics;

class First {
    public void show() {
        System.out.println("Show method of class A");
    }

    public void display() {
        System.out.println("Display method of class A");
    }
}
class Second extends First {
    public void display() {
        System.out.println("Display method of class B");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        First obj = new Second(); // Upcasting
        obj.display(); // Calls the display method of class Second due to dynamic method dispatch
        obj.show(); // Calls the show method of class First, as it is not overridden in class Second
    }
}
