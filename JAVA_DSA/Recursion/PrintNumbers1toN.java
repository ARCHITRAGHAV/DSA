package Recursion;

import java.util.Scanner;

public class PrintNumbers1toN {

    // global variable
    static int n = 10;

    public static void print2(int x) {
        if (x > n) return;
        System.out.print(x + " ");
        print2(x + 1);
    }

    // two parameters
    public static void print(int x, int n) {
        if (x > n) return;
        System.out.print(x + " ");
        print(x + 1, n);
    }

    // third method
    public static void print3(int n) {
        if (n == 0) return; // base case
        print3(n - 1); // function call
        System.out.print(n + " "); // work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);

        print2(1);

        print3(n);
    }
}
