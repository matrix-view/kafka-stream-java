package com.matrix.view.kafka_stream_java;

import com.matrix.view.kafka_stream_java.service.KafkaStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class KafkaStreamJavaApplication {

	@Autowired
	private KafkaStream kafkaStream;

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamJavaApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void initStreams() {
		kafkaStream.initStreams();
	}

}
