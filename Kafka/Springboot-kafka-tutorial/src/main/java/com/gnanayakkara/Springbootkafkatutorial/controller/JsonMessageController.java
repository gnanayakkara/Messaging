package com.gnanayakkara.Springbootkafkatutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnanayakkara.Springbootkafkatutorial.kafka.JsonKafkaProducer;
import com.gnanayakkara.Springbootkafkatutorial.payload.User;

/*
 * 20 Aug 2022
 */
@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

	private JsonKafkaProducer jsonKafkaProducer;
	
	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		this.jsonKafkaProducer = jsonKafkaProducer;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("Json message sent to kafka topic");
	}
}
