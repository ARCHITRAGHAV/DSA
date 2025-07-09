package Loops;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Composite Number");
        } else {
            System.out.println("NO");
        }
    }
}