package Arrays2D;

import java.util.ArrayList;

public class PascalTriangle {
    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int findCombination(int n, int r) {
        return findFactorial(n) / (findFactorial(r) * findFactorial(n - r));
    }

    public static void printPascal(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(findCombination(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i) {
//                    a.add(1);
//                } else {
//                    a.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
//                }
                a.add(findCombination(i,j));
            }
            arr.add(a);
        }

        System.out.println(arr);
//        printPascal(5);
    }
}
