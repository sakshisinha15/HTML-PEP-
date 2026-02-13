class StudentS {
    String name;
    int id;

    StudentS() {

    }

    StudentS(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class getclassss {
    public static void main(String[] args) {
        StudentS s1 = new StudentS();
        System.out.println(s1.getClass());
    }

}
