package com.srin.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="orders", groupId="group1")
	public void consume(String data) {
		System.out.println("Consumed message: "+ data);
	}
	
}
