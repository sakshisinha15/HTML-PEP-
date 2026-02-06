class A {
    static int a = 20;
    public static void display() {
        System.out.println("The value of a" + " " + a);
    }
}

class B extends A {
    static int b = 30;

    public static void displayb() {
        System.out.println("The value of b" + " " + b);
    }
}

public class multilevelinheritance extends B {
    public static void main(String[] args) {
        display();
        displayb();
    }
}
