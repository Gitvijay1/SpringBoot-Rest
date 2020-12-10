package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.app.mail.NitMailSender;

@Component
public class MailTestRunner implements CommandLineRunner{
	@Autowired
	private NitMailSender mail;

	@Override
	public void run(String... args) throws Exception {
		
		FileSystemResource file=new FileSystemResource("E:\\Old-data\\image");

		boolean send = mail.sendEmail("vs02101998@gmail.com", null, null, "welcome", "hello uder", file);
		if(send) {
			System.out.println("massage send");
		}
		else {
			System.out.println("sending fail");
		}
	}

}
