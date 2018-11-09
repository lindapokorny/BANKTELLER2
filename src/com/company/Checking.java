package com.company;

import java.util.HashMap;

public class Checking {
    static HashMap<String, Double> checkingBalance = new HashMap<>();
    static HashMap<String, Double> savingsBalance = new HashMap<>();

    public static HashMap<String, Double> getSavingsBalance() {
        return savingsBalance;
    }
    public static String checking() {


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
        return balance;
    }

    public static HashMap<String, Double> getCheckingBalance() {
        return checkingBalance;
    }

    public static HashMap<String, Integer> accounts = new HashMap<>();
    static Options options = new Options();

    public static int accountNumber = 100000000;

    public static String checkingAccount() {

        //iDK WHAT THE HELL IM DOING HERE!!!! ASK SOMEONE FOR HELP ABOUT THIS!

        accounts.put("Iris West", accountNumber++);
        accounts.put("Barry Allen", accountNumber++);
        accounts.put("Felicity Smoak", accountNumber++);
        accounts.put("Luke Cage", accountNumber++);
        accounts.put("Frank Castle", accountNumber++);

        System.out.println("Checking Customer Account Number: \n" + accounts);
        System.out.println();
        return checking();
    }

    public static HashMap<String, Integer> getCheckingAccounts() {
        return accounts;
}
    public static String savings() {

        double IW = 1300.45;
        double BA = 1599.03;
        double FS = 50000.27;
        double LC = 10000.10;
        double FC = 800.86;
        String savings = "Savings Account Balances : \n";
        savingsBalance.put("Iris West", IW);
        savingsBalance.put("Barry Allen", BA);
        savingsBalance.put("Felicity Smoak", FS);
        savingsBalance.put("Luke Cage", LC);
        savingsBalance.put("Frank Castle", FC);


        System.out.println(savings + savingsBalance + ": \n");
        return savings + savingsBalance + "\n" + savingsAccount();
    }


    public static String savingsAccount() {

        accounts.put("Iris West", accountNumber++);
        accounts.put("Barry Allen", accountNumber++);
        accounts.put("Felicity Smoak", accountNumber++);
        accounts.put("Luke Cage", accountNumber++);
        accounts.put("Frank Castle", accountNumber++);
        return String.valueOf(savingsBalance);
    }

}

