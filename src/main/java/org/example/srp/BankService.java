package org.example.srp;

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
