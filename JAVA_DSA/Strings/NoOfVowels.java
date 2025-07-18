package Strings;

public class NoOfVowels {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int count = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
