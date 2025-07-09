package Methods;

import java.util.Scanner;

public class nCrnPr {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int ncr(int n, int r) {
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        return ncr;
    }

    public static int npr(int n, int r) {
        int npr = factorial(n) / factorial(n - r);
        return npr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(ncr(n, r));
        System.out.println(npr(n, r));
    }
}