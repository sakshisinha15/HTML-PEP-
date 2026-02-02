import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // String Class = sc.next();
        // String degree = sc.next();
        // int age = sc.nextInt();
        // // double Grade = sc.nextDouble();
        // // System.out.println(name);
        // // System.out.println(Class);
        // // System.out.println(degree);
        // // System.out.println(age);
        // // System.out.println(Grade);
        // if (age >= 18) {
        // System.out.println("Eligible to vote");
        // } else {
        // System.out.println("Not eligible for voting");
        // }
        // System.out.println("Enter num1:");
        // int x = sc.nextInt();
        // System.out.println("Enter num2:");
        // int y = sc.nextInt();
        // if (x == y) {
        // System.out.println("Both are same");
        // } else if (x > y) {
        // System.out.println("Largest number is: " + x);
        // } else {
        // System.out.println("Largest number is: " + y);
        // }
        // int a = 2;
        // switch (a) {
        // case 1:
        // System.out.println("Hi");
        // break;
        // case 2:
        // System.out.println("Hello");
        // break;
        // case 3:
        // System.out.println("Bye");
        // break;
        // }
        char c = sc.next().charAt(0);
        switch (c) {
            case 'A':
                System.out.println("A for Apple");
                break;
            case 'B':
                System.out.println("B for Ball");
            case 'C':
                System.out.println("C for Cat");
            case 'D':
                System.out.println("D for dog");
            default:
                System.out.println("Invalid input");
        }

    }
}
