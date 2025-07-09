package If_Else;

import java.util.Scanner;

public class CpSp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextDouble();
        double sp = sc.nextDouble();
        double profit = sp - cp;
//        if (sp > cp) System.out.println("Profit made of " + profit);
//        if (sp < cp) System.out.println("Loss made of " + -profit);
//        if (sp == cp) System.out.println("No Profit No Loss");
        if (sp > cp) System.out.println("Profit made of " + (profit / cp) * 100 + "%");
        else if (cp > sp) System.out.println("Loss made of " + (-profit / cp) * 100 + "%");
        else System.out.println("No Profit No Loss");
    }
}