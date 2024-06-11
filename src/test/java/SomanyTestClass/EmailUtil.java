package SomanyTestClass;

import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailUtil {

    public static void sendEmailWithAttachment(String host, String port,
                                               final String userName, final String password, String toAddress,
                                               String subject, String message, String attachFiles) throws AddressException,
            MessagingException {

        // Sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port); // Use port 587 for TLS
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Use STARTTLS for port 587
        properties.put("mail.debug", "true");

        // Creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);

        // Creates a new email message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new java.util.Date());

        // Creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");

        // Creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // Adds attachments
        MimeBodyPart attachPart = new MimeBodyPart();

        try {
            attachPart.attachFile(attachFiles);
            multipart.addBodyPart(attachPart); // Add attachment only if successfully attached
        } catch (IOException ex) {
            ex.printStackTrace();
            // Handle attachment IO exception
        }

        // Sets the multi-part as e-mail's content
        msg.setContent(multipart);

        // Sends the e-mail
        Transport.send(msg);
    }
}
