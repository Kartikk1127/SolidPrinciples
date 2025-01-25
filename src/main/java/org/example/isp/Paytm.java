package org.example.isp;

//paytm doesn't support getCashback method but it is still forced to implement the method
public class Paytm implements UpiPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
