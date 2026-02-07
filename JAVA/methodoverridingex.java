class Animal {
    public void walk() {
        System.out.println("Can walk");
    }

    public void sound() {
        System.out.println("All animals can sound different");
    }
}

class cat extends Animal {
    public void sound() {
        System.out.println("Meow-meow");
    }
}

class dog extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class horse extends Animal {
    public void sound() {
        System.out.println("dhechu-dehcu");
    }
}

public class methodoverridingex {
    public static void main(String[] args) {
        Animal a = new cat();
        Animal a1 = new dog();
        Animal a2 = new horse();
        a.sound();
        a1.sound();
        a2.sound();
        a.walk();
    }
}
