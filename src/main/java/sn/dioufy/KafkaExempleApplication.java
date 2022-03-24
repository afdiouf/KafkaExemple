package sn.dioufy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExempleApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(KafkaTemplate<String, String> kafkaTemplate) {
		return args->{
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("dioufy", "Hello world, I'm dioufy :) " + i);
			}
		};}

}
