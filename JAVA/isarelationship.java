class A {
    static int a;

    public static void display() {
        System.out.println("Parent class");
    }

    int b;
    public void test() {
        System.out.println(b);
    }
}
class isarelationship extends A {
    public void info() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);
        display();
        isarelationship b = new isarelationship();
        b.test();
        b.info();
    }
}
// public class isarelationship {
// public static void main(String[] args) {

// }
// }
