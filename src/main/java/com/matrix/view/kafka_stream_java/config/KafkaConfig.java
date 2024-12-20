package com.matrix.view.kafka_stream_java.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class KafkaConfig {

    private static final Logger log = LoggerFactory.getLogger(KafkaConfig.class);
    @Value("${spring.application.test}")
    private String testValue;

    @Bean
    public String testContext() {
        log.atInfo().log(testValue);
        return testValue;
    }

}
