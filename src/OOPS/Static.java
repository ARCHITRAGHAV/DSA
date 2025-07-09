package OOPS;

class MathUtils {
    static void square(int x) {
        System.out.println(Math.pow(x, 2));
    }

    static void cube(int x) {
        System.out.println(Math.pow(x, 3));
    }
}

class counter {
    static int count = 0;

    counter() {
        count++;
    }

}

public class Static {
    public static void main(String[] args) {
        counter c = new counter();
        System.out.println(c.count);
        MathUtils.square(5);
        MathUtils.cube(5);
    }
}
