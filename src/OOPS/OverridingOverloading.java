package OOPS;

class MathCalc {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Employee {
    double baseSalary;

    double salary(double baseSalary) {
        System.out.println("1");
        this.baseSalary = baseSalary;
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus = 11000;

    double salary(double baseSalary) {
        System.out.println("2");
        baseSalary = baseSalary + bonus;
        return baseSalary;
    }
}

public class OverridingOverloading {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        System.out.println(e1.salary(100000));
        MathCalc m1 = new MathCalc();
        System.out.println("Sum = " + m1.sum(10, 200));
        System.out.println("Sum = " + (float) m1.sum(10.2, 30.4));
        System.out.println("Sum = " + m1.sum(10, 20, 30));

    }
}