package Recursion;

public class RecursionExample {
    public static void sayHello() {
        System.out.println("Hello");
        sayHello(); // it will run infinitely.
    }

    public static void main(String[] args) {
        sayHello();
    }

}
