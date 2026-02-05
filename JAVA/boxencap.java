class bottle {

}

public class boxencap {
    public static void main(String[] args) {
        boxencap b = new boxencap();
        printRef(b);
        boxencap b1 = new boxencap();
        printRef(b1);
        bottle b2 = new bottle();
        printRef(b2);
    }

    public static void printRef(boxencap b) {
        System.out.println(b);
    }

    public static void printRef(bottle b) {
        System.out.println(b);
    }
}
