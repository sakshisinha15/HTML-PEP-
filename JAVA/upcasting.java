class Person {
    String name;

    Person() {

    }

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int id;

    Student() {

    }

    Student(String name, int id) {
        super(name);
        this.id = id;
    }
}

public class upcasting {
    public static void main(String[] args) {
        // Student s1 = new Student("Sakshi", 111);
        // System.out.println(s1.name);
        // System.out.println(s1.id);

        // Upcasting
        // Person p1 = s1;
        // Person p2 = new Student("Khushi", 122); // directly assign ho jayega bina koi
        // referrence ke liye
        // System.out.println(p1.name);
        // System.out.println(p1.id);//yeh line error dega kyuki id jo hai voh voh child
        // class ka hai aur upcasting ka drawback hai ki agr upcasting ho gaya hai toh
        // tumhe chils class ke special members nhi access ho paayenge

        // downcasting
        Person p1 = new Student("Om", 1);
        Student s1 = (Student) p1;
        System.out.println(s1.id);
        System.out.println();
    }
}
