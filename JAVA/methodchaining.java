class Demo {
    Demo m1() {
        return this;
    }

    Demo m2() {
        return this;
    }

    Demo m3() {
        return this;
    }

    Demo m4() {
        return this;
    }
}

public class methodchaining {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1().m2().m3().m4();
    }
}
