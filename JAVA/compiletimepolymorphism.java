class Good {
    int price;
    String name;

    Good() {

    }

    Good(int price) {
        this.price = price;
    }

    Good(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void chocolate() {
        System.out.println("The price for the chocolate is Rs." + price);
    }

    public void chocolate(int price, String name) {
        System.out.println("The price for the" + name + "is Rs." + price);
    }
}

public class compiletimepolymorphism {
    public static void main(String[] args) {
        Good g = new Good(30);
        g.chocolate();
        g.chocolate(120, "Dairy Milk");
    }
}
