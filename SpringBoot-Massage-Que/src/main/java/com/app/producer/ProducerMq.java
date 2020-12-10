package com.app.producer;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class ProducerMq implements CommandLineRunner{
	@Autowired
	private JmsTemplate jt;
	
	@Value("${designation}")
	private String desig ;

	@Override
	public void run(String... args) throws Exception {

		jt.send(desig, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {

				TextMessage tm=session.createTextMessage(
						"SMPLE DATA"+new Date());
				return tm;
			}
		});
	}
	

}
