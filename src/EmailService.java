//In this example, the EmailService class directly depends on the GmailClient class, a low-level module that implements the details of sending emails using the Gmail API.
//
//This violates the DIP because the high-level EmailService module is tightly coupled to the low-level GmailClient module.

public class EmailService {

    GmailService gmailService = new GmailService();

    public void sendEmail(){
        gmailService.sendGmail();
    }
}
