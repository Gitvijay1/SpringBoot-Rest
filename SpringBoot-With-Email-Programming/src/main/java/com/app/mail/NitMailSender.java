package com.app.mail;


import javax.mail.internet.MimeMessage;

import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class NitMailSender {
	private JavaMailSender sender;
	
	public boolean sendEmail(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			Resource file
			) {
		boolean flag=false;
		
		try {
			//1 create MinmeMassage
			MimeMessage massage=sender.createMimeMessage();
			
			//2 create helper class
			MimeMessageHelper helper=new MimeMessageHelper(massage, file!=null?true:flag);
			
			//3 send details to message
			helper.setTo(to);
			helper.setText(text);
			helper.setSubject(subject);
			if(cc!=null && cc.length>0)
			
			if(bcc!=null && bcc.length>0)
			helper.setBcc(bcc);
			
			if(file!=null)
				helper.addAttachment(file.getFilename(), file);
				
			
			
			//4 send email
			sender.send(massage);
			
			flag=true;
		} catch (Exception e) {
              e.printStackTrace();
		}
		
		
		return flag;
	}

}
