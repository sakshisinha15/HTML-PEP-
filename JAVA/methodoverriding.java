class A {
    public void display() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    public void display() {
        System.out.println("Child Class");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        A a = new B();
        a.display();
    }
}
