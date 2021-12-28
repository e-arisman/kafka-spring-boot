package arisman.website.kafka;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

@SpringBootTest
@EmbeddedKafka
class KafkaSpringBootApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void test() {
		System.out.println();
		var original = new ArrayList<>(List.of(2, 3, 4));
		var dummy = new ArrayList<>(List.of(1, 2, 3));
		System.out.println(original.size());
		original.removeIf(a -> dummy.contains(a));
	
		System.out.println(original);
		System.out.println(original.size());
		System.out.println();
		
//		var nilai = "A";

	}

}
