package lab4;




import java.util.Properties;
import javax.mail.*;
        import javax.mail.internet.*;

public class javamailapi {

    public static void main(String[] args) {
        // Sender's Gmail email address and application-specific password
        String senderEmail = "manishcodetest@gmail.com";
        String appPassword = "Manish@1@1";

        // Recipient's email address
        String recipientEmail = "itsmanishgautam@gmail.com";

        // Sender's email host (Gmail)
        String host = "smtp.gmail.com";

        // Set mail properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Get the default Session object
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });
        try {
            // Create a default MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set From: header field
            message.setFrom(new InternetAddress(senderEmail));

            // Set To: header field
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));

            // Set Subject: header field
            message.setSubject("JavaMail API Test");

            // Set the actual message
            message.setText("This is a test email sent using JavaMail API with Gmail.");

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
