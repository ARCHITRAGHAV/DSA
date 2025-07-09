package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

//        for (int i = 1; i <= 100; i = i + 2) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
    }
}