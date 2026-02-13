class Student {
    String name;
    int id;

    Student() {

    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int hashCode() {
        return this.name.hashCode() + this.id;
    }
}

public class hashcodee {
    public static void main(String[] args) {
        Student s1 = new Student("Om", 1);
        Student s2 = new Student("Om", 1);
        System.out.println(s1.hashCode() == s2.hashCode());
    }

}
