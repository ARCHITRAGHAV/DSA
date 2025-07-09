package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        char[] arr = {'a', 'r', 'c', 'h', 'i', 't'};
        for (char ele : arr) {
            System.out.print(ele);
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        String t = sc.nextLine();
        System.out.println(t);
        String x = "Archit";
        System.out.println(x);
        System.out.println(x.charAt(0));
        System.out.println(x.length());
    }
}
