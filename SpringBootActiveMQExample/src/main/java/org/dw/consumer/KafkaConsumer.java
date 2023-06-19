package org.dw.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "${topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(String value){
        System.out.println("Kafka Message Received :: "+value.toString());
    }
}
