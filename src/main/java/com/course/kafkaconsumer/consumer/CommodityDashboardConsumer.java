package com.course.kafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class CommodityDashboardConsumer {

	private static final Logger log = LoggerFactory.getLogger(CommodityDashboardConsumer.class);
	
	@KafkaListener(topics = "t_commodity", groupId = "cg-dashboard")
	public void consume(String message) {
		log.info("Dashborad update with {}", message);
	}
}
