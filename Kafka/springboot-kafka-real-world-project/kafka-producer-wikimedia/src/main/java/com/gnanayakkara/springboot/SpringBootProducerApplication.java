package com.gnanayakkara.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 21 Aug 2022
 */
@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerApplication.class);
	}

	@Autowired
	private WikimediaChangesProducer wikimediaChangesProducer;
	
	public void run(String... args) throws Exception {
		wikimediaChangesProducer.sendMessage();
	}
}
