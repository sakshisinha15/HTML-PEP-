public class method {
    // No-arg method
    public static void add() {
        int a = 20;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);
    }

    // parameterized method
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    // practice
    public static void area(int radius) {
        double result = 3.14 * (radius * radius);
        System.out.println("Area of the Circle:");
        System.out.println(result);
    }

    public static void recarea(int length, int width) {
        int recresult = length * width;
        System.out.println("Area of the Rectangle:");
        System.out.println(recresult);
    }

    public static void squarearea(int length) {
        int sqresult = length * length;
        System.out.println("Area of the Square:");
        System.out.println(sqresult);
    }

    // method overloading-same name but different arguments(either by the length or
    // the datatype) inside a class
    public static int add1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int add1(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static double add1(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        add();
        add();
        add();

        add(30, 10);
        add(40, 10);
        add(234, 456);
        area(2);
        recarea(30, 20);
        squarearea(40);

        System.out.println("Method overloading");
        System.out.println(add1(23, 34, 455));
    }
}
