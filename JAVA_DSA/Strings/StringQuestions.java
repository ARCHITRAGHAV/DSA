package Strings;

import java.util.Scanner;

import static ArraysAndArrayLists.Questions.print;

public class StringQuestions {

    public static int sumOfAllSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                sum += Integer.parseInt(s.substring(i, j));
            }
        }
        return sum;
    }

    public static void printAllSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int vowelsCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean pallindrome(String s1) {
        int start = 0;
        int end = s1.length() - 1;
        while (start < end) {
            if (s1.charAt(start) != s1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "abcdefghijklmnopqrstuvwxyz";
//        System.out.println("No. of vowels = " + vowelsCount(s));
//        System.out.println(pallindrome("aa"));
//        int number = sc.nextInt();
//        String num = Integer.toString(number);
//        System.out.println(num + 10);
//        System.out.println(number + 10);
//        String s1 = sc.nextLine();
//        int no = Integer.parseInt(s1);
//        System.out.println(no + 10);
//        int number = sc.nextInt();
//        String num = Integer.toString(number);
//        System.out.println(num.length());
//        printAllSubstrings("abcd");
//        System.out.println(sumOfAllSubstrings("12"));
    }
}
