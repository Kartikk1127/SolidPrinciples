package org.example.srp;

//Single Responsibility Principle: Every java class must perform a single functionality.
//Implementation of multiple functionalities in a single class mess the code up

public class BankService {

    long amount;
    String accountNo;
    long currentAmount;
    public BankService(long amount, String accountNo){
        this.amount=amount;
        this.accountNo=accountNo;
    }
    public long deposit(long amount, String accountNo){
        //deposit amount
        currentAmount = getAmount(accountNo);
        currentAmount+=amount;
        return currentAmount;
    }

    public long getAmount(String accountNo) {
        return currentAmount;
    }

    public long withdraw(long amount, String accountNo){
        if (amount>currentAmount) return -1;
        currentAmount-=amount;
        return currentAmount;
    }
}
