class Book1 {
    String title;
    int price;
}

class box {
    int length;
    int width;

    double getarea() {
        double result = length * width;
        return result;
    }
}

public class book {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        Book1 b2 = new Book1();
        Book1 b3 = new Book1();
        b1.title = "Java";
        b1.price = 2000;
        b2.title = "Python";
        b2.price = 1000;
        b3.title = "SQL";
        b3.price = 500;
        System.out.println(b1.title + "=" + b1.price);
        System.out.println("-------------------------------------------");
        System.out.println(b2.title + "=" + b2.price);
        System.out.println("-------------------------------------------");
        System.out.println(b3.title + "=" + b3.price);
        System.out.println("-------------------------------------------");
        box b4 = new box();
        b4.length = 4;
        b4.width = 4;
        System.out.println("Area of the Box: " + b4.getarea());
        box b5 = new box();
        b5.length = 4;
        b5.width = 5;
        System.out.println("Area of the box: " + b5.getarea());
    }
}
