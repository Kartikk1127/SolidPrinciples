package org.example.srp;

//here you can see that it follows SRP, but does it follow OCP?
//what if in future i want to add a medium named "whatsapp"?
//should i change this class to support whatsapp as well?
//of course not, since the class should be open for extension but CLOSED for modification.
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
