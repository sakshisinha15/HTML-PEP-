interface A {
    final int a = 10;

    void display();
}

interface B {
    final int b = 20;

    void displayb();
}

class C implements A, B {
    public void display() {
        System.out.println("a value is :" + a);
    }

    public void displayb() {
        System.out.println("b value is: " + b);
    }
}

public class Interface1 {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.displayb();
    }
}
