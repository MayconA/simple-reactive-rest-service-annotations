package com.maa.reactiverestserviceannotations.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

//@ExtendWith(SpringExtension.class)
//We create a `@SpringBootTest`, starting an actual server on a `RANDOM_PORT`
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingRouterTest {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	public void testHello() {
		webTestClient
				// Create a GET request to test an endpoint
				.get().uri("/hello").accept(MediaType.TEXT_PLAIN).exchange()
				// and use the dedicated DSL to test assertions against the response
				.expectStatus().isOk().expectBody(String.class).isEqualTo("Hello, There!");
	}

}
