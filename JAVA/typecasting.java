public class typecasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Widening");
        System.out.println(b);
        double d = 10.3;
        int c = (int) d;
        System.out.println("Narrowing");
        System.out.println(c);
        // Ternary operators (conditional operators)
        int f = 20;
        int g = 30;
        int age = 20;
        System.out.println();
        System.out.println();
        System.out.println("10 Questions on the Ternary operators (conditional operators)");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println((f > g) ? f : g);
        System.out.println((f < g) ? g : f);
        System.out.println((age >= 18) ? "Yes" : "No");
        System.out.println((age % 2 == 0) ? "even" : "odd");
        System.out.println((age % 3 == 0) ? "odd" : "even");
        System.out.println((g == 20) ? "yes" : "no");
        System.out.println((f == 30) ? "yes" : "no");
        System.out.println((age == 20) ? "yes" : "no");
        System.out.println((age % 2 == 0 && age % 5 == 0) ? "Multiple of 2 and 5" : "not a Multiple of 2 and 5");
        System.out.println((age % 3 == 0 && age % 5 == 0) ? "Multiple of 3 and 5" : "not a Multiple of 3 and 5");

    }
}
