package Strings;

import java.util.Scanner;

public class StringsBasics {

    public static int compareTo(String a, String b) {

        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {

        // Character Array
//        char[] arr = {'a', 'r', 'c', 'h', 'i', 't'};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // String Initialisation and Declaration
//        String str = "Archit Raghav";
//        System.out.println(str);

        // String as an input
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s);

        // length() method
        String str = "Archit Raghav";
//        System.out.println(str.length());

        // charAt(index) method
//        System.out.println(str.charAt(0));

        // indexOf(character) method
//        System.out.println(str.indexOf('R'));

        // compareTo() method
//        String ktr = "Archit";
//        String gtr = "Archit";
//        System.out.println(ktr.compareTo(gtr));
//        System.out.println(compareTo(ktr, gtr));

        // contains() method
        String name = "Archit Raghav";
//        System.out.println(name.contains("Raghav"));

        // startsWith() method
//        System.out.println(name.startsWith("Arc"));

        // endsWith() method
//        System.out.println(name.endsWith("ave"));

        // toUpperCase() and toLowerCase() methods
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

        // concat() method
//        String s1 = "Archit ";
//        String s2 = "Raghav";
//        System.out.println(s1.concat(s2));

        // substring() method
//        System.out.println(name.substring(0, 6));
//        System.out.println(name.substring(7));
//        name = name.substring(0, 7) + 'r' + name.substring(8);
//        System.out.println(name);

        // equals() and ==
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

    }
}
