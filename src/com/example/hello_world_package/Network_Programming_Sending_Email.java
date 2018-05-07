package com.example.hello_world_package;


import java.net.UnknownHostException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class Network_Programming_Sending_Email {

    public static void main(String [] args) throws UnknownHostException, NoSuchProviderException {

        //FOR THIS CODE TO WORK, you must first allow your mail-sending gmail id to be accessible by less secure apps in the settings

        //ALSO ADD JavaMail API jar to your library first

        Properties properties = System.getProperties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");

        // Get the default Session object
        Session session = Session.getDefaultInstance(properties,null);



        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set Subject: header field
            message.setSubject("This is mail subject field.");

            // Now set the actual message
            message.setText("This is the actual message sent in the mail.");

            message.addRecipients(Message.RecipientType.TO, "aashish73134@gmail.com");

            // Send message

            String emailHost = "smtp.gmail.com";
            String fromUser = "auggieeeeeeeee";//just the id alone without @gmail.com
            String fromUserEmailPassword = "YOUR_gmail_PASSWORD_HERE";

            Transport transport = session.getTransport("smtp");

            transport.connect(emailHost, fromUser, fromUserEmailPassword);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Email sent successfully.");

            System.out.println("Message successfully sent....");
        } catch (MessagingException m) {

            m.printStackTrace();
            System.out.println("Could not send mail.");
        }




    }
}
