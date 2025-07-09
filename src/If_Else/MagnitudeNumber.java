package If_Else;

import java.util.Scanner;

public class MagnitudeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        if (x < 0) {
            x = -x;
        }
        int a = 10, b = 10;
        String result = x < 69 ? "Yes" : "No";
        System.out.println(result);
    }
}