package If_Else;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("It's at origin (" + x + ", " + y + ")");
        } else if (x > 0 && y > 0) {
            System.out.println("It's in first quadrant (" + x + ", " + y + ")");
        } else if (x < 0 && y > 0) {
            System.out.println("It's in second quadrant (" + x + ", " + y + ")");
        } else if (x < 0 && y < 0) {
            System.out.println("It's in third quadrant (" + x + ", " + y + ")");
        } else if (x > 0 && y < 0) {
            System.out.println("It's in fourth quadrant (" + x + ", " + y + ")");
        } else if (x == 0) {
            System.out.println("It's on Y-Axis (" + x + ", " + y + ")");
        } else {
            System.out.println("It's on X-Axis (" + x + ", " + y + ")");
        }
    }
}