package Strings;

public class CompareTo {

    public static int compareTo(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return (a.charAt(i) - b.charAt(i));
            }
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        String a = "Archit";
        String b = "Archita";
        System.out.println(compareTo(a, b));
    }
}
