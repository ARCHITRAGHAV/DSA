package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
//        int result = (number1 > number2) && (number1 > number3) ? number1 : ((number2 > number3) ? number2 : number3);
        int result = (number1 > number2) ?
                ((number1 > number3) ? number1 : number3) :
                (number2 > number3) ? number2 : number3;
        System.out.println(result);
    }
}