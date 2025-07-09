package Methods;

public class Arguments {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(23, 778, 90));
    }
}
