package com.gnanayakkara.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;

/*
 * 21 Aug 2022
 */

public class WikimediaChangesHandler implements EventHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaChangesHandler.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;
	private String topic;
	
	public WikimediaChangesHandler(KafkaTemplate<String, String> kafkaTemplate,String topic) {
		this.kafkaTemplate = kafkaTemplate;
		this.topic = topic;
	}

	public void onOpen() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void onClosed() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void onMessage(String event, MessageEvent messageEvent) throws Exception {
		LOGGER.info(String.format("event data -> %s", messageEvent.getData()));
		
		kafkaTemplate.send(topic, messageEvent.getData());
	}

	public void onComment(String comment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void onError(Throwable t) {
		// TODO Auto-generated method stub
		
	}

}
