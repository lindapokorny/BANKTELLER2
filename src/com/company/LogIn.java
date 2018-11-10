package com.company;

import java.util.Scanner;

public class LogIn {
    Teller teller = new Teller();
    Customer customer = new Customer();

    void LogIn() {
        teller();
    }


    public String teller() {
        System.out.println("Enter Username: ");
        String username;
        Scanner scanner = new Scanner(System.in);

        username = scanner.nextLine();


        if (username.equals("Teller1") || (username.equals("Teller2")) || (username.equals("Teller3"))) {
            password();
        } else {
            System.out.println("Wrong Username");
            teller();
        }
        return username;
    }

    public String password() {

        System.out.println("Enter Password: ");
        String password;
        Scanner scanner1 = new Scanner(System.in);
        password = scanner1.nextLine();

        if (password.equals("Linda1")) {
            return welcomePage();
        } else if (password.equals("Linda2")) {
            return welcomePage();
        } else if (password.equals("Linda3")) {
            return welcomePage();
        } else {
            System.out.println("Wrong Password");
        }
        return password;
    }

    public String welcomePage() {
        System.out.println("Welcome, would you like to view all customers? [Y/N]");
        String viewAll;
        Scanner scanner2 = new Scanner(System.in);
        viewAll = scanner2.nextLine();

        if (viewAll.equalsIgnoreCase("Y")) {
            teller.checkingOrSavings();
        } else teller.options();
        return viewAll;
    }

}

