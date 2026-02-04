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
        // char c = sc.next().charAt(0);
        // switch (c) {
        // case 'A':
        // System.out.println("A for Apple");
        // break;
        // case 'B':
        // System.out.println("B for Ball");
        // case 'C':
        // System.out.println("C for Cat");
        // case 'D':
        // System.out.println("D for dog");
        // default:
        // System.out.println("Invalid input");
        // }
        // String time = sc.next();
        // switch (time) {
        // case "Sunday":
        // System.out.println("Chill and Relax");
        // break;
        // case "Monday":
        // System.out.println("Classes from 11am-5pm ");
        // break;
        // case "Tuesday":
        // System.out.println("Classes from 9am-4pm ");
        // break;
        // case "Wednesday":
        // System.out.println("Classes from 9am-4pm ");
        // case "Thrusday":
        // System.out.println("Classes from 9am-4pm ");
        // case "Friday":
        // System.out.println("Classes from 10am-5pm ");
        // break;
        // case "Saturday":
        // System.out.println("Classes from 9am to 4pm");
        // break;
        // default:
        // System.out.println("Invalid Input");
        // }
        // for (int i = 0; i < 10; i++) {
        // System.out.println("*");
        // }
        // int i = 0;
        // while (i <= 50) {
        // System.out.println(i);
        // i = i + 2;
        // }
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 4; i++) {
        // int j = 1;
        // while (j <= 4) {
        // System.out.print(j * 2);
        // j++;
        // }
        // System.out.println();
        // }
        // System.out.println();
        // System.out.println("3 FEB Pattern");
        // System.out.println();
        // System.out.println("Pattern 1");
        // int l = 2;
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // System.out.print(l + " ");
        // l = l + 2;
        // }
        // System.out.println();
        // }
        // System.out.println();
        // System.out.println("Pattern 2");
        // System.out.println();
        // System.out.println();
        // int k = 1;
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // System.out.print(k + " ");
        // k = k + 1;
        // }
        // System.out.println();
        // }
        // System.out.println();
        // System.out.println("4 FEB Pattern");
        // System.out.println();
        // System.out.println("Pattern 1");
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // System.out.println("Pattern 2");
        // int n = 1;
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(n + " ");
        // n++;
        // }
        // System.out.println();
        // }
        // // char c = 'A';
        // // for (int i = 1; i <= 4; i++) {
        // // for (int j = 1; j <= i; j++) {
        // // System.out.print('A');
        // // c++;
        // System.out.println("Pattern 3");
        // for (char c = 'A'; c <= 'D'; c++) {
        // for (char d = 'A'; d <= c; d++) {
        // System.out.print(d);
        // }
        // System.out.println();
        // }
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        int o = 0;
        int t = 3;
        while (o <= t) {
            int temp = a[o];
            a[o] = a[t];
            a[t] = temp;
            o++;
            t--;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
        int[][] arr = new int[3][3];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 3; j++) {
                // arr[i] = sc.nextInt();
            }
        }
    }
}
// System.out.println();
