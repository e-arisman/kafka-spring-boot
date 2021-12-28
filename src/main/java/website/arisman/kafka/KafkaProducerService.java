package website.arisman.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	public static final String topic = "mytopic";
	  
	@Autowired
	private KafkaTemplate<String, User> kafkaTemp;
  
	public void publishToTopic(User user) {
		System.out.println("Publishing to topic " + topic);
		kafkaTemp.send(topic, user);
	}
}
