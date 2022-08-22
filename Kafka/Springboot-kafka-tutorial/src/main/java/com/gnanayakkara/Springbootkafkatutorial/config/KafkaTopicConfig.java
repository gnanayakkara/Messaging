package com.gnanayakkara.Springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/*
 * 20 Aug 2022
 */

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic javaGuidesTopic() {
		return TopicBuilder.name("javaguides").build();
	}
	
	@Bean
	public NewTopic javaGuides_JsonTopic() {
		return TopicBuilder.name("javaguides_json").build();
	}
}
