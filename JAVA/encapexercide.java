class Example {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter the age above 0 ");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class encapexercide {
    public static void main(String[] args) {
        Example e = new Example();
        e.setName("Sakshi");
        e.setAge(30);
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }
}
