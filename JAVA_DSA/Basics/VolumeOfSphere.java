package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        double volume = (double) 4 / 3 * PI * Math.pow(radius, 3);
        System.out.println("Volume of sphere = " + volume);
    }
}
