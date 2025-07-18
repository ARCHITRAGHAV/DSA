package Loops;

import java.util.Scanner;

public class araistob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= m; i++) {
            ans = ans * n;
        }
        System.out.println(ans);
    }
}
