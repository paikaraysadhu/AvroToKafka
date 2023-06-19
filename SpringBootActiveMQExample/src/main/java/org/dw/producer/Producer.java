package org.dw.producer;

import org.dw.dto.FixedIncomeOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/produce")
public class Producer {
	
	@Value("${queue.name}")
	private String queue;

	@Autowired
	private JmsTemplate jmsTemplate;

	@PostMapping("/message")
	public FixedIncomeOrderRequest sendMessage(@RequestBody FixedIncomeOrderRequest fixedIncomeOrderRequest) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			String studentAsJson = mapper.writeValueAsString(fixedIncomeOrderRequest);

			jmsTemplate.convertAndSend(queue, studentAsJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fixedIncomeOrderRequest;
	}
}
