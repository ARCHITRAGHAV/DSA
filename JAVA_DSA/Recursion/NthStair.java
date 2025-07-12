package Recursion;

public class NthStair {
    public static int recursion(int n) {
        if (n <= 2) return n;
        if (n == 3) return 4;
        return recursion(n - 1) + recursion(n - 2) + recursion(n - 3); // 3 jumps
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
