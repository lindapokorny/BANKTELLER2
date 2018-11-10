package com.company;

public class Account {
    int number;
    double balance;
    String accountName;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    Account(){}

    public Account(int number, double balance, String name) {
        this.number = number;
        this.balance = balance;
        this.accountName= name;
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public double withdraw(double withdrawalAmount) throws Exception {
        if (balance > withdrawalAmount) {
            balance = balance - withdrawalAmount;
            return withdrawalAmount;
        } else {
            throw new Exception("Error. Insufficient funds.");
        }
    }
    @Override
    public String toString(){
        return "Account number: " + number + "\n Account Balance: " + balance;
    }
}
