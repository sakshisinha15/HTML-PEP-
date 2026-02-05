public class fruitencap {
    String name;

    fruitencap() {

    }

    fruitencap(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        fruitencap f1 = new fruitencap("Apple");
        fruitencap f2 = f1;
        fruitencap f3 = f2;
        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);
        f2.name = "Banana";
        System.out.println(f1.name);
        System.out.println(f2.name);
        System.out.println(f3.name);
    }
}
