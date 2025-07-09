package Loops;

public class PositiveTerms {
    public static void main(String[] args) {
        int a = 99, b = 95, d = b - a;
        for (int i = a; i > 0; i = i + d) {
            System.out.print(i + " ");
        }
        //or
        for (int i = a; i > 0; i--) {
            if (a > 0) {
                System.out.print(a + " ");
                a += d;
            }
        }
    }
}