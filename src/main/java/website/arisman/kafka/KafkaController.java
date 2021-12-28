package website.arisman.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {

	@Autowired 
	KafkaProducerService producer;
	
	@PostMapping(value="/post")
	public void sendMessage(@RequestBody User user) {
		producer.publishToTopic(user);
	}
}
