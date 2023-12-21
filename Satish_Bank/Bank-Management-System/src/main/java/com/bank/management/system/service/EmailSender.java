package com.bank.management.system.service;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
   
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//    "umang999327@gmail.com"
    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();
    final String USER_NAME = this.getEmail();   //User name of the Goole(gmail) account
    final String PASSSWORD = "wdmyguehqimuabhx";  //Password of the Goole(gmail) account
    final String FROM_ADDRESS = "satishsjr101@gmail.com";  //From addresss
 
    public EmailSender() {
    }

//    public static void main(String[] args) {
//      EmailSender email = new EmailSender();
//     //Sending test email
//      email.createAndSendEmail("praveenmukati52@gmail.com", "Test email subject",
//      "Congratulations !!! \nThis is test email Ritesh .");
//    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }
 
    private void sendEmailMessage() {
     
     //Create email sending properties
     Properties props = new Properties();
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.port", "587");
  
    Session session = Session.getInstance(props,
    new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("riteshpatil930286@gmail.com", "dwmyguehqimuabhx");
   }
    });

  try {

     Message message = new MimeMessage(session);
     message.setFrom(new InternetAddress("riteshpatil930286@gmail.com")); //Set from address of the email
     message.setContent(msgText,"text/html"); //set content type of the email
     
    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(this.getEmail())); //Set email recipient
    
    message.setSubject("Hello World"); //Set email message subject
    Transport.send(message); //Send email message

   System.out.println("sent email successfully!");

  } catch (MessagingException e) {
       throw new RuntimeException(e);
  }
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
//   BodyPart messageBodyPart = new MimeBodyPart();

//          // Now set the actual message
//          messageBodyPart.setText("This is message body");

//          // Create a multipar message
//          Multipart multipart = new MimeMultipart();

//          // Set text message part
//          multipart.addBodyPart(messageBodyPart);

//          // Part two is attachment
//          messageBodyPart = new MimeBodyPart();
//          String filename = "/home/manisha/file.txt";
//          DataSource source = new FileDataSource(filename);
//          messageBodyPart.setDataHandler(new DataHandler(source));
//          messageBodyPart.setFileName(filename);
//          multipart.addBodyPart(messageBodyPart);

//          // Send the complete message parts
//          message.setContent(multipart);

//          // Send message
//          Transport.send(message);