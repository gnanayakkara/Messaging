package com.gnanayakkara.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/*
 * 21 Aug 2022
 */
@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("wikimedia_recentchange").build();
	}
}
