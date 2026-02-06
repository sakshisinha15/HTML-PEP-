import java.util.Scanner;

public class charh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char c = 'A';
        for (int i = 0; i <= 26; i++) {
            if (i == n) {
                System.out.print((char) (65 + i));
            }
        }
    }
}
