package OOPS;

class Printer {
    public int print(int n) {
        return n;
    }

    public String print(String name) {
        return name;
    }

    public float print(float price) {
        return price;
    }
}

abstract class Shape {
    abstract void area(int n);
}

class Circle extends Shape {
    void area(int radius) {
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println(area);
    }
}

class Square extends Shape {
    void area(int side) {
        double area = side * side;
        System.out.println(area);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        System.out.println(p1.print(20));
        System.out.println(p1.print("Archit"));
        System.out.println(p1.print(97.0f));

        Circle c = new Circle();
        c.area(5);

        Square s = new Square();
        s.area(5);
    }
}
