package OOPS;

class Vehicle {
    void start() {
        System.out.print("runs on ");
    }
}

class car extends Vehicle {
    void start() {
        super.start();
        System.out.print("diesel.");
        System.out.println();
    }
}

class bike extends Vehicle {
    void start() {
        super.start();
        System.out.print("petrol.");
        System.out.println();
    }
}

class Animal {
    void eats() {
        System.out.println("eats");
    }
}

class Birds extends Animal {
    void eats() {
        super.eats();
        System.out.println("eats small animals.");
    }
}

class Parrot extends Birds {
    void speak() {
        System.out.println("speaks");
    }

    void eats() {
        super.eats();
        System.out.println("eats chillies.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        bike b = new bike();
        b.start();

        Parrot p = new Parrot();
        p.speak();
        p.eats();
    }
}
