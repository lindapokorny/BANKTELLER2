package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Teller {

    Account account = new Account();
    public static String name;
    public static int accountNumber = 100000000;
    static HashMap<String, Double> checkingBalance = new HashMap<>();
    static HashMap<String, Double> savingsBalance = new HashMap<>();
    public static HashMap<String, Integer> savingsAccount = new HashMap<>();



    public String options1() {

        String[] optionsArray = new String[]{"DEPOSIT", "WITHDRAWAL", "DELETE customer", "ADD new customer", "LOG OUT", ""};
        System.out.println("Please choose from our list of options1");
        System.out.println(Arrays.toString(optionsArray));
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine().toUpperCase();
        double deposit;
        double withdraw;

        if (answer.equals("DEPOSIT")) {
            Account account = new Account();
            System.out.println("How much would you like to deposit?");
            Scanner scanner1 = new Scanner(System.in);
            deposit = scanner1.nextDouble();
            account.deposit(deposit);
            return String.valueOf(account.getBalance());
        } else if (answer.equals("WITHDRAWAL")) {
            Account account = new Account();
            System.out.println("How much would you like to withdraw?");
            Scanner scanner1 = new Scanner(System.in);
            withdraw = scanner1.nextInt();
            //account.withdraw(withdraw) throws Exception;
            return String.valueOf(withdraw);
        } else if (answer.equalsIgnoreCase("DELETE")) {
            return String.valueOf(Customer.deleteAccount(accountNumber));
        } else if (answer.equals("ADD")) {

            int number;
            double balance;
            String name;

            System.out.println("Account number: ");
            Scanner scanner1 = new Scanner(System.in);
            number = scanner1.nextInt();
            System.out.println("How much would you like to Start your account with?");
            Scanner scanner2 = new Scanner(System.in);
            balance = scanner2.nextDouble();
            System.out.println("Enter Name: ");
            Scanner scanner3 = new Scanner(System.in);
            name = scanner3.nextLine();
            return Customer.addAccount(number, balance, name);
        } else if (answer.equals("L"))
            return null;
        return null;
    }
    public String checking() {
        System.out.println(String.valueOf(checkingAccount()));

        double IW = 120.34;
        double BA = 54.76;
        double FS = 1278.20;
        double LC = 86.25;
        double FC = 26.78;
        String balance = "Checking Account Balances : \n";
        checkingBalance.put("Iris West", IW);
        checkingBalance.put("Barry Allen", BA);
        checkingBalance.put("Felicity Smoak", FS);
        checkingBalance.put("Luke Cage", LC);
        checkingBalance.put("Frank Castle", FC);

        System.out.println(balance + checkingBalance + ":\n");
        return options1();
    }


    public static HashMap<String, Double> checkingAccount() {

        savingsAccount.put("Iris West", accountNumber++);
        savingsAccount.put("Barry Allen", accountNumber++);
        savingsAccount.put("Felicity Smoak", accountNumber++);
        savingsAccount.put("Luke Cage", accountNumber++);
        savingsAccount.put("Frank Castle", accountNumber++);

        System.out.println("Customer Checking Account Number: \n" + String.valueOf(savingsAccount));
        System.out.println();
        return checkingBalance;
    }


    public HashMap<String, Double> savings() {
        System.out.println(String.valueOf(savingsAccount()));

        double IW = 1300.45;
        double BA = 1599.03;
        double FS = 50000.27;
        double LC = 10000.11;
        double FC = 800.86;
        String savings = "Savings Account Balances : \n";
        savingsBalance.put("Iris West", IW);
        savingsBalance.put("Barry Allen", BA);
        savingsBalance.put("Felicity Smoak", FS);
        savingsBalance.put("Luke Cage", LC);
        savingsBalance.put("Frank Castle", FC);


        System.out.println(savings + savingsBalance + ": \n");
        return savingsBalance;
    }


    public String savingsAccount() {

        savingsAccount.put("Iris West", accountNumber++);
        savingsAccount.put("Barry Allen", accountNumber++);
        savingsAccount.put("Felicity Smoak", accountNumber++);
        savingsAccount.put("Luke Cage", accountNumber++);
        savingsAccount.put("Frank Castle", accountNumber++);

        return options1();

    }

    public String options() {

        String[] optionsArray = new String[3];
        System.out.println(Arrays.toString(optionsArray));
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine().toUpperCase();

        if (answer.equals("ADD")) {
            return add();
        } else if (answer.equals("BALANCE")) {
            return checkingOrSavings();
        } else if (answer.equals("DELETE")) {
            return delete();
        } else if (answer.equals("LOG OUT")) {
            return logOut();
        } else {
            return null;
        }
    }

    public static HashMap<String, Integer> getSavingsAccount() {
        return savingsAccount;
    }

    public String checkingOrSavings() {
        String answer;
        System.out.println("Checking or Savings?");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("checking")) {
            System.out.println(checkingBalance);
            return String.valueOf(checking());
        } else {
            System.out.println(savingsBalance);
            return String.valueOf(savings());

        }

    }

    public static String add() {


        Random rnd = new Random();
        int accountNumberNew = accountNumber + rnd.nextInt(999999999);

        System.out.println("Enter the name you'd like to add.");
        Scanner scanner2 = new Scanner(System.in);
        name = scanner2.nextLine();
        getSavingsAccount().put(name, accountNumberNew);
        System.out.println(getSavingsAccount());

        return String.valueOf(getSavingsAccount());
    }

    public static String delete() {
        Scanner scanner = new Scanner(System.in);
        String remove;
        remove = scanner.nextLine();
        getSavingsAccount().remove(name, accountNumber);
        System.out.println(getSavingsAccount());
        return remove;
    }

    public static String logOut() {
        System.out.println("Thank you for logging out");

        return null;
    }

}
