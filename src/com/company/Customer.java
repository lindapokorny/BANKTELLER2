package com.company;

import java.util.HashMap;

public class Customer {
    Customer(){}

    public static HashMap<Integer, Account> customerAccounts = new HashMap<>();
    String name;

    public String getName(){
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void makeADeposit(double amount, int accountNumber) {
        Account account = customerAccounts.get(accountNumber);
        account.deposit(amount);

    }

    public double makeAWithdrawal(double amount, int accountNumber) throws Exception{
        Account account = customerAccounts.get(accountNumber);
        account.withdraw(amount);
        return amount;
    }

    public static String addAccount(int number, double balance, String name){
        Account account = new Account(number, balance, name);
        customerAccounts.put(number, account);
        return name;
    }

    public static double deleteAccount(int number){
        Account account = customerAccounts.get(number);
        double balance = account.getBalance();
        customerAccounts.remove(number);
        return balance;
    }

    public void printAccounts(){
        for (Integer key : customerAccounts.keySet()) {
           Account account = customerAccounts.get(key);
            System.out.println(account.toString());
        }
    }
}

