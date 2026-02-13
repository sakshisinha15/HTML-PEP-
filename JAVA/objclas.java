import java.lang.*;

class Student {
    String name;
    int id;

    Student() {

    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Name:- " + name + " Id:- " + id;
    }
}

public class objclas {
    public static void main(String[] args) {
        Student s = new Student("Sakshi", 12311346);
        System.out.println(s.toString());
        System.out.println(s);
    }
}
