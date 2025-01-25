package org.example;

import org.example.srp.BankService;
//Single Responsibility Principle: Every java class must perform a single functionality.
//Implementation of multiple functionalities in a single class mess the code up

//the open closed principle states that according to the new requirements the module should be open for extension but closed for
//modifications

public class Main {
    public static void main(String[] args) {
        //if you want to deposit money
        BankService bankService = new BankService(0,"");
        bankService.deposit(10000,"1234567890");
        bankService.withdraw(1000,"1234567890");

        System.out.println(bankService.getAmount("1234567890"));

    }
}