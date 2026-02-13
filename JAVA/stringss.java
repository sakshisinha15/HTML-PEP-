import java.lang.*;

public class stringss {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hi";
        String s3 = "Hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3) == s3.equals(s1));// to checkk the state of the object

        System.out.println("------------------------------------------------");
        String s5 = new String("Hello");
        String s6 = new String("Hello");
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}