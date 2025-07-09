package If_Else;

import java.util.Scanner;

public class RealNumberIsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        // if(num == (int) num)
        if (num - (int) num == 0) {
            System.out.println("Integer");
        } else {
            System.out.println("Not an integer");
        }
    }
}
