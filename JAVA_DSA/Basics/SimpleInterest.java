package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount = ");
        double principle = sc.nextDouble();
        System.out.print("Enter rate of interest = ");
        double rate = sc.nextDouble();
        System.out.print("Enter time period = ");
        double time = sc.nextDouble();
        double si = (principle * rate * time) / 100;
        System.out.println("SI = " + si);
    }
}
