package com.course.kafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class CommodityNotificationConsumer {

	private static final Logger log = LoggerFactory.getLogger(CommodityNotificationConsumer.class);
	
	@KafkaListener(topics = "t_commodity", groupId = "cg-notification")
	public void consume(String message) {
		log.info("Notification update with {}", message);
	}
}
