import java.lang.*;

public class stringmetho {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("o"));
        System.out.println(s.charAt(1));
        System.out.println(s.toCharArray());
        System.out.println(s);

        System.out.println(s.hashCode());
    }
}
