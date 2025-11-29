package in.arunIt.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {
	@Autowired
	private JavaMailSender mailsender;
	
	public boolean sendEmail(String to, String subject, String body) {
		try {
			/*SimpleMailMessage msg =new SimpleMailMessage(); 
			msg.setTo(to);
			msg.setSubject(subject);
			msg.setText(body);*/
			
			MimeMessage createMimeMessage = mailsender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(createMimeMessage);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body,true);
			
			
			mailsender.send(createMimeMessage);
			
			return true;
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//TODO
		
		
		return false;
		
	}

}
