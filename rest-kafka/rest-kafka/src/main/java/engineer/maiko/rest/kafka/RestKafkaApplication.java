package engineer.maiko.rest.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class RestKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestKafkaApplication.class, args);
	}

}
