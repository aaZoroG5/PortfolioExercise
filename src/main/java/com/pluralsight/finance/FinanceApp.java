package com.pluralsight.finance;

public class FinanceApp {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "300", 1500);

        account1.deposit(100);
//        account2.deposit(100);
        System.out.println(account1.getValue());

        //test credit card class
        CreditCard studentAccount = new CreditCard("Brian", "919", 2000);
        studentAccount.charge(500);
        System.out.println(studentAccount.getValue());

    }
}
