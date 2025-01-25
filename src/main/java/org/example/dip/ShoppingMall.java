package org.example.dip;

public class ShoppingMall {

    /*private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard){
        this.debitCard=debitCard;
    }

    public void purchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        //here you can see that shopping mall is tightly coupled with the debit card. In case there is some error  in your debit card, you cannot purchase
        //anything from the shopping mall
        //what can we do? What if we want ki bhyi mai to credit card se payment krunga...can you do that right now? Of course not.
        //If you want to make transaction using your credit card, you have to change the code to be able to adapt credit card.
        //this tight coupling is not allowing us to be flexible right?'
        //hence this does not follow dependency inversion principle
        DebitCard debitCard1 = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard1);
        shoppingMall.purchaseSomething(5000);
    }*/


    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void purchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard1 = new DebitCard();
        BankCard bankCard2 = new CreditCard();

        //this is also an example of run time polymorphism
        ShoppingMall shoppingMall = new ShoppingMall(bankCard2);
        shoppingMall.purchaseSomething(4000);
    }
}
