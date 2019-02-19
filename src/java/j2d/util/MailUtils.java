/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author USER
 */
public class MailUtils {
    
  public void orderReadyMail() throws AddressException, MessagingException{
        String from = "";
        String username= "";
      String  password = "";
       String subject="";
       String message = "";
       String to= "";
   
        Properties props = System.getProperties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.auth","true");
         props.put("mail.smtp.port","465");
          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
          props.put("mail.smtp.socketFactory.port","465");
          props.put("mail.smtp.port","465");
          props.put("mail.smtp.socketFactory.fallback","false");
          
          Session mses=Session.getDefaultInstance(props, null);
          mses.setDebug(true);
          
          Message msg = new MimeMessage(mses);
           
          msg.setFrom(new InternetAddress(from));
          msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
          msg.setContent(message,"text/html");
          msg.setSubject(subject);
          
          Transport tp = mses.getTransport("smtp");
          tp.connect("smtp.gmail.com", username, password);
          tp.sendMessage(msg, msg.getAllRecipients());
  }
}