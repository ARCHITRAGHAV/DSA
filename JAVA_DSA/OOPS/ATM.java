package OOPS;

import java.util.Scanner;

class BankAccount {
    public String username;
    public long number;
    private String password;
    long balance = 10000000;
    long deposit;
    long withdraw;

    void setUsername(String username) {
        this.username = username;
    }

    void setNumber(long number) {
        this.number = number;
    }

    void setPassword(String pwd) {
        this.password = pwd;
    }

    void showBalance() {
        System.out.println("Balance = " + balance);
    }

    void toDeposit(long deposit) {
        this.deposit = deposit;
        balance = balance + deposit;
        System.out.println("Balance = " + balance);
    }

    void toWithdraw(long withdraw) {
        this.withdraw = withdraw;
        balance = balance - withdraw;
        System.out.println("Balance = " + balance);
    }

}

public class ATM {
    public static void main(String[] args) {
        System.out.println("Welcome to Matrix Bank");
        BankAccount account1 = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        account1.setUsername(username);
        System.out.print("Enter mobile no.: ");
        long number = sc.nextLong();
        account1.setNumber(number);
        sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        account1.setPassword(password);
        boolean flag = true;
        if (password.equals("12345@")) {
            while (flag) {
                System.out.println("\nAvailable Options:");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                System.out.println();
                switch (choice) {
                    case 1: {
                        account1.showBalance();
                        break;
                    }
                    case 2: {
                        System.out.print("Enter amount to be deposit: ");
                        long deposit = sc.nextLong();
                        account1.toDeposit(deposit);
                        break;
                    }
                    case 3: {
                        System.out.print("Enter amount to be withdraw: ");
                        long withdraw = sc.nextLong();
                        account1.toWithdraw(withdraw);
                        break;
                    }
                    case 4: {
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("You have entered wrong choice.");
                    }
                }
            }
        } else {
            System.out.println("Wrong Password");
        }
    }
}
