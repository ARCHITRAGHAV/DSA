package Strings;

public class Interning {
    public static void main(String[] args) {
        String s = "Hello"; // s -> "Hello"
        String g = "Hello"; // g -> "Hello"
        g = "Mello"; // g -> "Mello"
        System.out.println(s);
        System.out.println(g);
    }
}
