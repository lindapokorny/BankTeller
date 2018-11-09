package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Options {
    static HashMap<String, Double> savingsBalance = new HashMap<>();

    public static String checkingOrSavings() {
        String answer;
        System.out.println("Checking or Savings?");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        answer.toLowerCase();
        if (answer.equals("checking")) {
            return checking();
        } else {
            return savings();

        }
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
        return savings + savingsBalance + "\n" + allSavingsCustomers();
    }
    public static String allSavingsCustomers() {

        accounts.put("Iris West", accountNumber++);
        accounts.put("Barry Allen", accountNumber++);
        accounts.put("Felicity Smoak", accountNumber++);
        accounts.put("Luke Cage", accountNumber++);
        accounts.put("Frank Castle", accountNumber++);
        return String.valueOf(savingsBalance);
    }


    public static String checking() {

        HashMap<String, Double> checkingBalance = new HashMap<>();
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

    public static HashMap<String, Integer> accounts = new HashMap<>();
    static Options options = new Options();

    public static int accountNumber = 100000000;

    public static String allCheckingCustomers() {

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

    public static HashMap<String, Integer> getAccounts() {
        return accounts;
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

    public static String add(){

        System.out.println("Enter the name you'd like to add.");
        Scanner scanner2 = new Scanner(System.in);
        getAccounts();
        name = scanner2.nextLine();
        accounts.put(name, accountNumber++);

        System.out.println(accounts);

        return name;
    }
}
