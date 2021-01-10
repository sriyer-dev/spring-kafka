package com.srin.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "orders";
	
	public void publishMessages(String data) {
		kafkaTemplate.send(TOPIC, data);		
	}

}
