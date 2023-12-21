package com.passwordactivationcode;
/**
 *
 * @author Parth
 */
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.Random;

public class javaEmailSender {

    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();

    String USER_NAME; // User name of the Goole(gmail) account
    final String PASSSWORD = "1286106s"; // Password of the Goole(gmail) account
    final String FROM_ADDRESS = "satishsjr101@gmail.com"; // From addresss

    public javaEmailSender() {
    }

    public String password() {
        javaEmailSender email = new javaEmailSender();
        // Sending test email
        int length = 10;
        String password = new String(autoGeneratePassword(length));
        System.out.println("\t\t Password has been created ");
        email.createAndSendEmail("" + emailAddressTo + "", "Hii",
                "" + password + "");
        return password;
    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }

    private void sendEmailMessage() {

        // Create email sending properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("satishsjr101@gmail.com", "bcrhyybyihgjhxuy");
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("satishsjr101@gmail.com")); // Set from address of the email
            message.setContent(msgText, "text/html"); // set content type of the email

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("" + emailAddressTo + "")); // Set
            // email
            // recipient

            message.setSubject("Account Password"); // Set email message subject
            Transport.send(message); // Send email message

            System.out.println("\t\t Password sent on email");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public char[] autoGeneratePassword(int len) {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String values = Capital_chars + Small_chars
                + numbers + symbols;
        Random rndm_method = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(rndm_method.nextInt(values.length()));

        }
        return password;
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject) {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText) {
        this.msgText = msgText;
    }

}
