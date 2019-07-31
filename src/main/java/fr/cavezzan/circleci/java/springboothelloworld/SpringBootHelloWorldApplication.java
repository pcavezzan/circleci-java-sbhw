package fr.cavezzan.circleci.java.springboothelloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootHelloWorldApplication.class);

	@Bean
	HelloWorldService helloWorldService() {
		return new HelloWorldService();
	}

	@Bean
	CommandLineRunner cliRunner(HelloWorldService helloWorldService) {
		return args -> {
			final String result = helloWorldService.execute();
			LOG.info(result);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}

