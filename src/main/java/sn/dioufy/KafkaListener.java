package sn.dioufy;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
	
	@org.springframework.kafka.annotation.KafkaListener(topics = "dioufy", groupId = "groupId")
	void listener(String data) {
		System.out.println("Listener received : " + data + " ");
	}

}
