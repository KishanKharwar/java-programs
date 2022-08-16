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

  public static void main(String[] args) throws AddressException {
    // email ID of Recipient.
    String[] recipients = new String[4];

// add email addresses
    recipients[0] = "first@gmail.com";
    recipients[1] = "second@gmail.com";
    recipients[2] = "third@gmail.com";
    recipients[3] = "fourth@gmail.com";

    String receiverEmailList = String.join(", ", recipients);

    // email ID of  Sender.
    String sender = "pingkishank@gmail.com";

    // using host as localhost
    String host = "127.0.0.1";

    // Getting system properties
    Properties properties = System.getProperties();

    // Setting up mail server
    properties.setProperty("mail.smtp.host", host);

    // creating session object to get properties
    Session session = Session.getDefaultInstance(properties);

    try {
      // MimeMessage object.
      MimeMessage message = new MimeMessage(session);

      // Set From Field: adding senders email to from field.
      message.setFrom(new InternetAddress(sender));

      // Set To Field: adding recipient's email to from field.

      message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmailList));

      // Set Subject: subject of the email
      message.setSubject("This is Subject");

      // set body of the email.
      message.setText("This is a test mail");

      // Send email.
      Transport.send(message);
      System.out.println("Mail successfully sent");
    } catch (MessagingException mex) {
      mex.printStackTrace();
    }
  }
}
