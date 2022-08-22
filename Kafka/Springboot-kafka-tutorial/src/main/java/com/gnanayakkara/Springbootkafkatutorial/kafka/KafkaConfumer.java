package com.gnanayakkara.Springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/*
 * 20 Aug 2022
 */

@Service
public class KafkaConfumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConfumer.class);
	
	@KafkaListener(topics = "javaguides",groupId = "myGroup")
	public void consume(String message) {
		LOGGER.info(String.format("Message Received -> %s", message));
	}
}
