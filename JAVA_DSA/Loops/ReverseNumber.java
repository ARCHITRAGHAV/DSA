package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            int ld = n % 10;
            reverse = (reverse * 10) + ld;
            n /= 10;
        }
        System.out.println(reverse);
    }
}