package OOPS;

class Student {
    String name;
    int roll;
    int marks[];

    Student(String name, int roll) {
        marks = new int[2];
        this.name = name;
        this.roll = roll;
    }

    Student(Student s1) {
        marks = new int[2];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
}

class Book {

    String title;
    float price;
    String authors[];

    Book(String title, float price) {
        authors = new String[3];
        this.title = title;
        this.price = price;
    }

    Book(Book b1) {
        authors = new String[3];
        this.title = b1.title;
        this.price = b1.price;
        for (int i = 0; i < authors.length; i++) {
            authors[i] = b1.authors[i];
        }
    }
}

public class Constructors {
    public static void main(String[] args) {
        Book b1 = new Book("Footprints Without Foot", 799);
        b1.authors[0] = "H.G. Wells";
        b1.authors[1] = "Robert Frost";
        b1.authors[2] = "J.K. Rowling";
        System.out.println(b1.title);
        System.out.println(b1.price);
        Book b2 = new Book(b1);
        for (int i = 0; i < b2.authors.length; i++) {
            System.out.println(b2.authors[i]);
        }

        Student s1 = new Student("Archit", 20);
        s1.marks[0] = 99;
        s1.marks[1] = 98;
        Student s2 = new Student(s1);
        s1.marks[1] = 100;
        System.out.println(s2.name);
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
