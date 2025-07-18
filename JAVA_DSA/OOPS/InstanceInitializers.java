package OOPS;

class Bird {
    {
        System.out.println("Bird Created");
    }

    Bird() {
        System.out.println("Bird Ready");
    }
}

public class InstanceInitializers {
    public static void main(String[] args) {
        Bird b = new Bird();
    }

}