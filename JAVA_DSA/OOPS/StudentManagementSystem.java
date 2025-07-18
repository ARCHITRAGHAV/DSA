package OOPS;

class Students {
    String name;
    int roll;

    void setName(String name) {
        this.name = name;
    }

    void setRoll(int roll) {
        this.roll = roll;
    }

    void getName() {
        System.out.println(name);
    }

    void getRoll() {
        System.out.println(roll);
    }

    void calcPercentage(int marks1, int marks2, int marks3) {
        double percentage = (double) (marks1 + marks2 + marks3) / 3;
        if (percentage >= 91) {
            System.out.println((float) percentage);
            System.out.println("Grade is: A");
        } else if (percentage >= 81 && percentage <= 90) {
            System.out.println((float) percentage);
            System.out.println("Grade is: B");
        } else {
            System.out.println((float) percentage);
            System.out.println("Grade is: C");
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Archit Raghav");
        s1.getName();
        s1.setRoll(20);
        s1.getRoll();
        s1.calcPercentage(100, 97, 98);
    }
}
