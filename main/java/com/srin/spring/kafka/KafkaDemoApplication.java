package com.srin.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaDemoApplication {

	@Autowired
	private KafkaProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}

	@GetMapping("/publish/{data}")
	public String publishMessage(@PathVariable String data) {
		producer.publishMessages(data);
		return "Published to Kafka: "+ data;
	}
	
}
