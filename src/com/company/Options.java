package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Options extends Checking {

    public static HashMap<String, Integer> getSavingsAccount () {
        return accounts;
    }
    public static String checkingOrSavings() {
        String answer;
        System.out.println("Checking or Savings?");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        answer.toLowerCase();
        if (answer.equals("checking")) {
            System.out.println("You chose checking: " + getCheckingAccounts());
            return checking();
        } else {
            System.out.println("You chose savings: "+ getSavingsAccount());
            return answer;

        }
    }

    public static String options() {
        String[] optionsArray = new String[]{"ADD new customer","BALANCE","LIST existing accounts", "DELETE customer", "LOG OUT"};
        System.out.println("Please choose from our list of options");
        System.out.println(Arrays.toString(optionsArray));
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine().toUpperCase();

        if (answer.equals("ADD")) {
            return add();
        }else if( answer.equals("BALANCE")){
            return checkingOrSavings();
        } else if (answer.equals("LIST")) {
            return null;
        } else if (answer.equals("DELETE")) {
            return null;
        } else if (answer.equals("LOG OUT"))
            return null;
        return answer;
    }
    public static String name;

public static void randomNumber(){
    Random rnd = new Random();
    int n = accountNumber + rnd.nextInt(999999999);

}
    public static String add(){

        System.out.println("Enter the name you'd like to add.");
        Scanner scanner2 = new Scanner(System.in);
        name = scanner2.nextLine();
        getSavingsAccount().put(name, accountNumber++);
        System.out.println(accounts);


        return String.valueOf(getSavingsAccount());
    }
}
