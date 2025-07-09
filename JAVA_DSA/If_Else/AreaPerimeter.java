package If_Else;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if (area > perimeter) {
            System.out.println("Yes, because area = " + area + " and perimeter = " + perimeter);
        } else {
            System.out.println("No, because area = " + area + " and perimeter = " + perimeter);
        }
    }
}