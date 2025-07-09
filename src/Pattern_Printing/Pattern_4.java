package Pattern_Printing;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 97; j < n + 97; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}