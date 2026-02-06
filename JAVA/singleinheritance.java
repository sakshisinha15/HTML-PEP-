class single {
    static int a = 10;

    public static void display() {
        System.out.println("The value of a" + " " + a);
    }
}

public class singleinheritance extends single {
    public static void main(String[] args) {
        display();
    }
}
