package com.matrix.view.kafka_stream_java;

import com.matrix.view.kafka_stream_java.config.KafkaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackageClasses = KafkaConfig.class)
public class KafkaStreamJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamJavaApplication.class, args);
	}

}
