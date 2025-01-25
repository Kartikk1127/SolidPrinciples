package org.example;

import org.example.srp.BankService;
//Single Responsibility Principle: Every java class must perform a single functionality.
//Implementation of multiple functionalities in a single class mess the code up

//the open closed principle states that according to the new requirements the module should be open for extension but closed for
//modifications

//Liskov Substitution Principle applies to inheritance in such a way that the derived classes must be completely substitutable for their base classes. In other words,
// if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behaviour of the program

//Interface Segregation Principle states that the larger interfaces split into smaller ones. Because,
//the implementation classes use only the methods that are required. We should not force the client
//to use the methods that they do not want to use.
//It's goal is similar to the Single Responsibility Principle

public class Main {
    public static void main(String[] args) {
        //if you want to deposit money
        BankService bankService = new BankService(0,"");
        bankService.deposit(10000,"1234567890");
        bankService.withdraw(1000,"1234567890");

        System.out.println(bankService.getAmount("1234567890"));

    }
}