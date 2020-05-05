package com.rabbitmq.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//rabbitTemplate.convertAndSend("hello from RabbitMq 1st msg");
		//rabbitTemplate.convertAndSend("TestExchange", "TestRouting",
				//"hello from RabbitMq 1st msg");
		
		SimpleMessage simpleMessage = new SimpleMessage();
		simpleMessage.setName("Delivery details");
		simpleMessage.setDescription("From USA to India");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic",
				simpleMessage);
	}

}
