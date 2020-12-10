package com.app.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRunner {
	
	@JmsListener(destination = "sample-one")
	public void readMassage(String massage) {
		System.out.println("reciverd massage is "+massage);
	}

}
