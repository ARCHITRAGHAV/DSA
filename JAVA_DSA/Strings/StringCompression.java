package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaabbbbbccccddde";
        String ans = "" + s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1) ans += count;
                count = 1;
                ans += s.charAt(i);
            }
        }
        if (count > 1) ans += count;
        System.out.println(ans);
    }
}
