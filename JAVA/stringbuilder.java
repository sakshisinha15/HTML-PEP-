public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.insert(1, "Hii"));
        System.out.println(sb.append("Hello"));
        System.out.println(sb.delete(1, 4));
        System.out.println(sb.replace(2, 3, "aa"));
        System.out.println(sb.reverse());
    }
}
