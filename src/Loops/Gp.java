package Loops;

import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        int a = 1, r = 2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
