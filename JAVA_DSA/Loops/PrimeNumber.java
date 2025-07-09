package Loops;

public class PrimeNumber {

    public static void printPrimes(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("No. of prime numbers = " + count);
    }

    public static void prime(int n) {
        boolean flag = true;
        if (n == 1) {
            flag = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime No.");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checkPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        printPrimes(1, 100);
        prime(1);
    }
}