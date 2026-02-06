class A {
    static int a;

    public static void display() {
        System.out.println("The value of a" + " " + a);
    }
}
class B extends A {
    static int b;

    public static void displayc() {
        System.out.println("The value of b" + " " + b);
    }
}

public class hierarchicalinheritance extends A {
    public static void main(String[] args) {
        // displayc();
        display();
    }
}
