class lpu {
    String name;

    lpu() {
    }

    lpu(String name) {
        this.name = name;
    }
}

class faculty extends lpu {
    int fid;

    faculty() {
    }

    faculty(String name, int fid) {
        super(name);
        this.fid = fid;
    }
}

class student extends lpu {
    int sid;

    student() {
    }

    student(String name, int sid) {
        super(name);
        this.sid = sid;
    }
}

class parent extends student {
    int pid;

    parent() {
    }

    parent(String name, int sid, int pid) {
        super(name, sid);
        this.pid = pid;
    }
}

public class hierarchicalupcastanddowncast {
    public static void main(String[] args) {
        // upcasting
        lpu l = new parent();
        // System.out.println(l.pid);
        System.out.println(l.name);
        // System.out.println(l.fid);
        // // faculty f = (faculty) l;
        // // System.out.println(l instanceof faculty);
        // System.out.println(l instanceof student);
        // student s = (student) l;
        // downcasting
        parent f = (parent) l;
        System.out.println(f.pid);
        // faculty f = (faculty) l;
        // System.out.println(f.name);
    }
}
// class A {

// }

// class B extends A {

// }

// class C extends A {

// }

// class D extends C {
// // // Upcasting
// // A a = new D();
// // // downcasting
// // B b = (B) a;
// // //instanceof
// }

// public class hierarchicalupcastanddowncast {
// public static void main(String[] args) {
// // Upcasting
// A a = new D();
// // downcasting
// // B b = (B) a;
// // instanceof
// System.out.println(a instanceof A);
// System.out.println(a instanceof C);
// System.out.println(a instanceof B);
// if (a instanceof B) {
// B b = (B) a;
// } else {
// System.out.println("Do not have instance of this class");
// }
// }
// }
