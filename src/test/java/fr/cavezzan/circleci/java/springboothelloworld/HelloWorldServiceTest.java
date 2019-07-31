package fr.cavezzan.circleci.java.springboothelloworld;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HelloWorldServiceTest {

	@Test
	public void executeShouldReturnHelloWorld() {
		final HelloWorldService service = new HelloWorldService();
		final String result = service.execute();
		final String expected = "Hello World!";
		assertThat(result).isEqualTo(expected);
	}

}