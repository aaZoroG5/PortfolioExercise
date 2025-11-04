package com.pluralsight.finance;

public class CreditCard implements Valuable{

    //properties
    private String name;
    private String accountNumber;
    private double balance;

    //constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;//Looking at this as credit limit
    }

    //getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void charge (double amount) {
        setBalance(balance - amount);
    }

    public void payment (double amount) {
        setBalance(balance + amount);
    }

    @Override
    public double getValue(){
        return this.getBalance();
    }
}
