package Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String s = "racecar";
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        System.out.println(flag);
    }
}
