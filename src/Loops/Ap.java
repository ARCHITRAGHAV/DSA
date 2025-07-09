package Loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a = 2;
        int b = 5;
        int d = b - a;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            a += d;
        }
        // or
        for (int i = a; i <= d * num - 1; i = i + d) {
            System.out.print(i + " ");
        }
    }
}