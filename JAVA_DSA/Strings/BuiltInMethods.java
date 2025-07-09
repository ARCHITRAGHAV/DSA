package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Archit Raghav";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('w'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String str = "Harshita";
        System.out.println(str.contains("Harsh"));
        System.out.println(str.contains("Harshit"));
        if (str.contains("Harsh")) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
        System.out.println(str.startsWith("Ha"));
        System.out.println(str.endsWith("ita"));
        String s1 = "778";
        int n = Integer.parseInt(s1);
        System.out.println(n);
    }
}
