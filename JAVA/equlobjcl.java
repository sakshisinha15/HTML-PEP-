class Student {
    String name;
    int id;

    Student() {

    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.name.equals(s.name) && this.id == s.id;
    }
}

public class equlobjcl {
    public static void main(String[] args) {
        Student s1 = new Student("Om", 1);
        Student s2 = new Student("Om", 1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
