package org.example;

import org.example.srp.BankService;

public class Main {
    public static void main(String[] args) {
        //if you want to deposit money
        BankService bankService = new BankService(0,"");
        bankService.deposit(10000,"1234567890");
        bankService.withdraw(1000,"1234567890");

        System.out.println(bankService.getAmount("1234567890"));

    }
}