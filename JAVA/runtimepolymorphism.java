class Plant {
    public void apperance() {
        System.out.println("All belongs to the plant Family");
    }

    public void height() {
        System.out.println("The height will differ");
    }
}

class Tree extends Plant {
    public void height() {
        System.out.println("The height of tree is large");
    }
}

class sapling extends Plant {
    public void height() {
        System.out.println("The height of sapling is small");
    }
}

public class runtimepolymorphism {
    public static void main(String[] args) {
        Plant b = new Tree();
        Plant a = new sapling();
        b.height();
        a.height();
    }
}
