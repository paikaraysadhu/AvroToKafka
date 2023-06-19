//package org.dw.config;
//
//import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
//
//@Configuration
//public class Config {
//
//    @Bean
//    public ConsumerFactory<String,String> consumerFactory(KafkaProperties kafkaProperties){
//        return new DefaultKafkaConsumerFactory<String, String>(kafkaProperties.buildConsumerProperties());
//    }
//
//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String,String>> kafkaListenerContainerFactory(KafkaProperties kafkaProperties){
//        ConcurrentKafkaListenerContainerFactory<String,String> factory=new ConcurrentKafkaListenerContainerFactory<String, String>();
//        factory.setConsumerFactory(consumerFactory(kafkaProperties));
//        return factory;
//    }
//
//}
