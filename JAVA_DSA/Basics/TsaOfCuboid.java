package Basics;

import java.util.Scanner;

public class TsaOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        int length = sc.nextInt();
        System.out.print("Enter the width = ");
        int width = sc.nextInt();
        System.out.print("Enter the height = ");
        int height = sc.nextInt();
        double tsa = 2 * ((length * width) + (width * height) + (height * length));
        System.out.println("T.S.A. of cuboid = " + tsa);
    }
}