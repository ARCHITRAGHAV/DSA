package Recursion;

import java.util.Scanner;

public class ARaiseToB {

    public static int pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }

    public static int pow1(int a, int b) {
        if (b == 1) return a;
        if (b % 2 == 0) return pow1(a, b / 2) * pow1(a, b / 2);
        else return pow1(a, b / 2) * pow1(a, b / 2) * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a, b));
        System.out.println(pow1(a, b));
    }
}
