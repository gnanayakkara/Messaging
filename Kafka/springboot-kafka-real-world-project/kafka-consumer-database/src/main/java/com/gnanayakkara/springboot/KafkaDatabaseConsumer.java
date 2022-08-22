package com.gnanayakkara.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.gnanayakkara.springboot.entity.WikimediaData;
import com.gnanayakkara.springboot.repository.WikimediaDataRepositry;

/*
 * 21 Aug 2022
 */

@Service
public class KafkaDatabaseConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
	
	private WikimediaDataRepositry dataRepository;
	
	public KafkaDatabaseConsumer() {
		
	}
	
	public KafkaDatabaseConsumer(WikimediaDataRepositry dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	@KafkaListener(topics = "wikimedia_recentchange",
				   groupId = "myGroup")
	public void consume(String eventMessage) {
		LOGGER.info(String.format("Event message received -> %s", eventMessage));
		
		WikimediaData wikimediaData = new WikimediaData();
		wikimediaData.setWikiEventData("Done");
		
		dataRepository.save(wikimediaData);
	}
}
