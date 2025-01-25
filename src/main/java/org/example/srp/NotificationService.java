package org.example.srp;

public class NotificationService {
    public void sendOtp(String medium){
        if (medium.equals("email")){
            //java smtp to send emails
        }
        if (medium.equals("mobile")){
            //twillio api can be used here
        }
    }
}
