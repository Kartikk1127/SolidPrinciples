//Now, the EmailService class depends on the EmailClient abstraction, and the low-level email client implementations (GmailClient and OutlookClient) depend on the abstraction.
//This follows the DIP, resulting in a more flexible and extensible design.
public class EmailService {

    public void sendEmail(EmailClient mailClient){
        mailClient.sendMail();
    }
}
