package Loops;

import java.util.Scanner;

public class SumofNumandReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + (n % 10);
            n /= 10;
        }
        int sum = num + reverse;
        System.out.println(sum);
    }
}