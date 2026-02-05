class Student {
    String name;
    int id;
    static String clgname = "LPU";  
    Student() {

    }
    Student(String name, int id) {
        this.name = name;
        this.id = id;
        // this.clgname=clgname;
    }
}

public class stat {
    public static void main(String[] args) {
        Student s1 = new Student("Sakshi", 1);
        Student s2 = new Student("Khushi", 2);
        Student s3 = new Student("Moni", 3);
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(Student.clgname);
        System.out.println("--------------------------");
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.clgname);
        System.out.println("--------------------------");
        System.out.println(s3.name);
        System.out.println(s3.id);
        System.out.println(s3.clgname);
        // System.out.println(s1.name);

        // System.out.println(s1.name);
        // System.out.println(s1.name);
        // System.out.println(s1.name);
        s3.clgname = "DU";
        System.out.println(s1.clgname);
        System.out.println(s2.clgname);
        System.out.println(s3.clgname);
    }
}
