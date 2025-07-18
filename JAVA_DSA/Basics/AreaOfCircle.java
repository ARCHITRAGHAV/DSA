package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        System.out.print("Enter the radius = ");
        int radius = sc.nextInt();
        double area = PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

