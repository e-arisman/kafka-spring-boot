package website.arisman.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics="mytopic", groupId="mygroup")
	public void consumeFromTopic(User user) {
		System.out.println("Consummed message " + user);
	}
}
