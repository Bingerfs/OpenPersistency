package it.xpug.birthday_greetings;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SmtpEmailService implements EmailService {
    private Integer port;
    private String address;

    public SmtpEmailService(String address, Integer port) {
        this.port = port;
        this.address = address;
    }

    public void send(Greeting greeting) throws AddressException, MessagingException {
        java.util.Properties props = new java.util.Properties();
		props.put("mail.smtp.host", address);
		props.put("mail.smtp.port", "" + port);
		Session session = Session.getInstance(props, null);

		// Construct the message
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("sender@sender.com"));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(greeting.recipient));
		msg.setSubject(greeting.subject);
		msg.setText(greeting.body);

		// Send the message
		Transport.send(msg);
    }

    
    

    
    
}