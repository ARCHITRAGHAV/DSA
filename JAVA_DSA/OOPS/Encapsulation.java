package OOPS;

import java.util.Scanner;

class BankAccounts {
    public String username;
    private final String password;

    BankAccounts(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}

class Laptop {
    private String brands;
    private int ram;
    private float price;

    void setProps(String brands, int ram, float price) {
        this.brands = brands;
        this.ram = ram;
        this.price = price;
    }

    public String getBrands() {
        return brands;
    }

    public int getRam() {
        return ram;
    }

    public float getPrice() {
        return price;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop l = new Laptop();
        String brands = sc.nextLine();
        int ram = sc.nextInt();
        float price = sc.nextFloat();
        sc.nextLine();
        l.setProps(brands, ram, price);
        System.out.println(l.getBrands());
        System.out.println(l.getRam());
        System.out.println(l.getPrice());

        String username = sc.nextLine();
        String password = sc.nextLine();
        BankAccounts account = new BankAccounts(username, password);
        System.out.println(account.getUsername());
        System.out.println(account.getPassword());
    }
}