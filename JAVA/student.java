
class stu {
    String name;
    int id;
    String loc;

    stu() {
        name = "Sakshi";
        id = 12311346;
    }

    stu(String name, int id, String loc) {
        this.name = name;// this(name,id)
        this.id = id;
        this.loc = loc;
    }

    stu(String name) {
        this.name = name;
    }

    stu(String name, int id) {
        this.name = name;// this(name)
        this.id = id;
    }
}

public class student {
    public static void main(String[] args) {
        stu s = new stu();
        System.out.println(s.name);
        System.out.println(s.id);
        System.out.println("--------------------------------------");
        System.out.println("PERSONAL INFO(Parameterized constructor");
        System.out.println("--------------------------------------");
        stu s4 = new stu("Khushi", 12311346, "Bijnor");
        System.out.println(s4.name);
        System.out.println(s4.id);
        System.out.println("--------------------------------------");
        System.out.println("PERSONAL INFO(constructor Overloading");
        System.out.println("--------------------------------------");
        System.out.println(s4.loc);
        System.out.println("---------------------------------------");
        stu s5 = new stu("Khushi");
        System.out.println(s5.name);
        System.out.println("---------------------------------------");
        stu s6 = new stu("Khushi", 12311346);
        System.out.println(s6.name);
        System.out.println(s6.id);
    }
}
