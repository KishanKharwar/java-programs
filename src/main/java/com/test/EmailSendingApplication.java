package com.test;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSendingApplication {


  public static void main(String[] args) {
    String to = "aslam.mohamed@ingrammicro.com";//change accordingly
    String from = "kishankumar.kharwar@ingrammicro.com";//change accordingly
    String host = "USCHIZRELAY.corporate.ingrammicro.com";//or IP address

    //Get the session object
    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", host);
    Session session = Session.getDefaultInstance(properties);

    //compose the message
    try{
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));
      message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
      message.setSubject("Ping");
      message.setText("Hello, this is example of sending email  ");

      // Send message
      Transport.send(message);
      System.out.println("message sent successfully....");

    }catch (MessagingException mex) {mex.printStackTrace();}
  }

//  public static void main(String[] args) throws AddressException {
//    // email ID of Recipient.
//    String[] recipients = new String[4];
//
//// add email addresses
//    recipients[0] = "kishankumar.kharwar@ingrammicro.com";
////    recipients[1] = "second@gmail.com";
////    recipients[2] = "third@gmail.com";
////    recipients[3] = "fourth@gmail.com";
//
//    String receiverEmailList = String.join(", ", recipients);
//
//    // email ID of  Sender.
//    String sender = "aslam.mohamed@ingrammicro.com";
//
//    // using host as localhost
//    String host = "USCHIZRELAY.corporate.ingrammicro.com";
//
//    // Getting system properties
//    Properties properties = System.getProperties();
//
//    // Setting up mail server
//    properties.setProperty("mail.smtp.host", host);
//
//    // creating session object to get properties
//    Session session = Session.getDefaultInstance(properties);
//
//    try {
//      // MimeMessage object.
//      MimeMessage message = new MimeMessage(session);
//
//      // Set From Field: adding senders email to from field.
//      message.setFrom(new InternetAddress(sender));
//
//      // Set To Field: adding recipient's email to from field.
//
//      message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmailList));
//
//      // Set Subject: subject of the email
//      message.setSubject("This is Subject");
//
//      // set body of the email.
//      message.setText("This is a test mail");
//
//      // Send email.
//      Transport.send(message);
//      System.out.println("Mail successfully sent");
//    } catch (MessagingException mex) {
//      mex.printStackTrace();
//    }
//  }
}
