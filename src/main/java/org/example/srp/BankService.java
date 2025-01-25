package org.example.srp;

//Single Responsibility Principle: Every java class must perform a single functionality.
//Implementation of multiple functionalities in a single class mess the code up

//example of a bad code
public class BankService {
    public long deposit(long amount, String accountNo){
        //deposit amount
        return 0;
    }

    public long withdraw(long amount, String accountNo){
        //withdraw amount
        return 0;
    }

    public void printPassbook(){
        //update the transaction info in the passbook
    }

    //in future, for loans like education loan or let's say business loan this class has to be modified to be able to support
    //all the loans
    public void getLoanInterestInfo(String loanType){
        if (loanType.equals("homeLoan")){
            //do some job
        }
        if (loanType.equals("personalLoan")){
            //do some job
        }
        if (loanType.equals("car")){
            //do some job
        }
    }

    //in future, if otp sending is done through sms, this class has to be modified in order to be able to support it.
    public void sendOtp(String medium){
        if (medium.equals("email")){
            //java smtp to send emails
        }
    }
}
