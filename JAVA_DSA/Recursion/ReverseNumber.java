package Recursion;

public class ReverseNumber {

    public static void printReverse(int n) {
        if (n == 0) return;
        int rem = n % 10;
        System.out.print(rem);
        printReverse(n / 10);
    }

    public static void main(String[] args) {
        printReverse(6734); // 4376
    }
}
