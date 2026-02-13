import java.util.*;

class Phone {
    String rsize;
    int storage;
    String name;

    Phone(String rsize, int storage, String name) {
        this.name = name;
        this.storage = storage;
        this.rsize = rsize;
    }

    public String toString() {
        return "MODEL:- " + name + " Storage:- " + storage + " SIZE:-" + rsize;
    }
}

public class phoneobjcl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[3];
        // int storage1 = sc.nextInt();
        // String rs = sc.nextLine();
        // String nm = sc.nextLine();
        Phone p = new Phone("8GB", 128, "Redmi");
        // System.out.println(p.toString());
        Phone p1 = new Phone("12GB", 256, "POCO");
        // System.out.println(p1.toString());
        Phone p2 = new Phone("24GB", 64, "Iphone");
        phones[0] = p;
        phones[1] = p1;
        phones[2] = p2;
        for (int i = 0; i < 3; i++) {
            System.out.println(phones[i]);
        }
        // System.out.println(p2.toString());
    }
}
