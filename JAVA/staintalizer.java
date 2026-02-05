public class staintalizer {
    // single line static intializwer
    static int a = 10;
    // multiline static intializer
    static {
        System.out.println("I am from static block;");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("I am from static block;");
    }
}
