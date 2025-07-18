package Strings;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        String s = "i am a student";
        System.out.println(s);
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                sb.reverse();
                ans = ans + sb + ' ';
                sb.delete(0, sb.length());
            }
            if (i == (s.length() - 1)) {
                sb.reverse();
                ans = ans + sb;
                sb.delete(0, sb.length());
            }
        }
        System.out.println(ans);
    }
}
