class Fruit {
    String name;
    int size;

    Fruit() {

    }

    Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public boolean equals(Object o) {
        Fruit f = (Fruit) o;
        return this.name.equals(f.name) && this.size == f.size;
    }
}

public class equalsobjclass {
    public static void main(String[] args) {
        Fruit ff = new Fruit("Apple", 20);
        Fruit ff1 = new Fruit("Apple", 20);
        System.out.println(ff == ff1);
        System.out.println(ff.equals(ff1));
    }
}
