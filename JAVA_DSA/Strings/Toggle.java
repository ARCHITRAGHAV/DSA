package Strings;

import java.util.Scanner;

public class Toggle {

    public static void toggleCharacters(String s) {
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < s1.length(); i++) {
            int ascii = s1.charAt(i);
            if ((int) s1.charAt(i) >= 48 && (int) s1.charAt(i) <= 57) continue;
            else if (s1.charAt(i) == ' ') continue;
            if (s1.charAt(i) >= 97) {
                ascii -= 32;
                s1.setCharAt(i, (char) ascii);
            } else {
                ascii += 32;
                s1.setCharAt(i, (char) ascii);
            }
        }
        String newS = s1.toString();
        System.out.println(newS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) continue;
            else if (str.charAt(i) == ' ') continue;
            if ((int) (str.charAt(i)) >= 97) {
                ascii -= 32;
                str.setCharAt(i, (char) ascii);
            } else {
                ascii += 32;
                str.setCharAt(i, (char) ascii);
            }
        }
        System.out.println(str);
        toggleCharacters("aRcHiT rAgHaV");
    }
}
