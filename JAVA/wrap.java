public class wrap {
    public static void main(String[] args) {
        // Boxing(converting the primitive to non primitive)
        int a = 10;
        Integer i = new Integer(a);
        System.out.println(i);
        // Autoboxing
        int b = 20;
        Integer j = b;
        System.out.println(j);

        // unboxing(with the help of int value convert npd to pr)
        int x = i.intValue();
        System.out.println(x);

        // autounboxing(with the help of int value convert npd to pr)
        int y = j;
        System.out.println(y);

        // parsing techniques (static method)
        // available only to numeric string into the number
        String s1 = "12";
        byte v = Byte.parseByte(s1);
        System.out.println(v);
        String s2 = "123";
        short k = Short.parseShort(s2);
        System.out.println(k);
        String s3 = "10.5";
        double c = Double.parseDouble(s3);
        System.out.println(c);
        String s4 = "1224235456422";
        long d = Long.parseLong(s4);
        System.out.println(d);
        float f = Float.parseFloat(s3);
        System.out.println(f);

    }
}
