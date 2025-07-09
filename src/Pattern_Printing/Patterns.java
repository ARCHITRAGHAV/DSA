package Pattern_Printing;

public class Patterns {

    public static void pattern33(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern32(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int a = i;
                int b = j;
                if (i > n) a = 2 * n - i;
                if (j > n) b = 2 * n - j;
                System.out.print(Math.min(a, b) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
        nsp = 1;
        nst = 2 * n - 3;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }

    public static void pattern29(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern27(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern26(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern25(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern24(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst++;
        }
//        or
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern23(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }

    public static void pattern21(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n / 2 + 1) || j == (n / 2 + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern18(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 65; i < n + 65; i++) {
            for (int j = 1; j <= (n + 65 - i); j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char) (j + 64) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 65; i < n + 65; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j < i + 65; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 97; i < n + 97; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 65; i < n + 65; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 97; j < n + 97; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j < n + 65; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(3, 5);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(4);
        System.out.println();
        pattern6(4);
        System.out.println();
        pattern7(4);
        System.out.println();
        pattern8(4);
        System.out.println();
        pattern9(4);
        System.out.println();
        pattern10(4);
        System.out.println();
        pattern11(4);
        System.out.println();
        pattern12(4);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(4);
        System.out.println();
        pattern15(4);
        System.out.println();
        pattern16(4);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(5, 7);
        System.out.println();
        pattern19(5);
        System.out.println();
        pattern20(5);
        System.out.println();
        pattern21(4);
        System.out.println();
        pattern22(4);
        System.out.println();
        pattern23(5);
        System.out.println();
        pattern24(4);
        System.out.println();
        pattern25(4);
        System.out.println();
        pattern26(4);
        System.out.println();
        pattern27(4);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern29(4);
        System.out.println();
        pattern30(4);
        System.out.println();
        pattern31(5);
        System.out.println();
        pattern32(4);
        System.out.println();
        pattern33(6);
        System.out.println();
    }
}