class returnm {
    double length;
    double breadth;

    returnm() {

    }

    returnm(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static returnm createBox() {
        return new returnm();
    }

    public static returnm createBox(double length, double breadth) {
        return new returnm(length, breadth);
    }
}

public class returnmathodref {
    public static void main(String[] args) {
        returnm b = new returnm(10, 20);
        System.out.println(b.length);
        System.out.println(b.breadth);

    }
}
