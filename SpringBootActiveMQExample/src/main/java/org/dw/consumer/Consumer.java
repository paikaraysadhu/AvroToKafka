package org.dw.consumer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.dw.dto.FixedIncomeOrderRequest;
import org.dw.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	KafkaProducer kafkaProducer;

	@JmsListener(destination = "${queue.name}")
	public void consumeMessage(String message) {
		try {
			jsonToAvroSchema();
			kafkaProducer.sendMessage(message);
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("Message received from activemq queue---" + message);
	}

	private void jsonToAvroSchema() {
		Schema schema = ReflectData.get().getSchema(FixedIncomeOrderRequest.class);

		File schemaFile = new File("src/main/resources/FixedIncomeOrderRequest.avsc");
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(schemaFile);
			fileWriter.append(schema.toString(true));
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private FixedIncomeOrderRequest stringToPojo(String message) {
		FixedIncomeOrderRequest orderEntryReqst = null;
		try {
			orderEntryReqst = new ObjectMapper().readValue(message, FixedIncomeOrderRequest.class);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return orderEntryReqst;
	}

}
