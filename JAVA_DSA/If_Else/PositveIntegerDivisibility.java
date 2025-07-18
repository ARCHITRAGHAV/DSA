package If_Else;

import java.util.Scanner;

public class PositveIntegerDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(5 + " " + 3);
        } else if (num % 3 == 0) {
            System.out.println(3);
        } else if (num % 5 == 0) {
            System.out.println(5);
        } else {
            System.out.println("No");
        }
    }
}