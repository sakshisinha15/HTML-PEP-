abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int radius;

    Circle() {

    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of the Circle is :" + 3.14 * radius * radius);
    }
}

class Tri extends Shape {
    int b;
    int h;

    Tri() {

    }

    Tri(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public void area() {
        System.out.println("Area of the triangle is :" + 0.5 * b * h);
    }
}

public class abstraction {
    public static void main(String[] args) {
        Shape s = new Circle(30);
        Shape s1 = new Tri(40, 50);
        s.area();
        s1.area();
    }
}
