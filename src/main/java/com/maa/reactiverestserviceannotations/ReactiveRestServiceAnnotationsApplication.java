package com.maa.reactiverestserviceannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maa.reactiverestserviceannotations.hello.GreetingWebClient;

@SpringBootApplication
public class ReactiveRestServiceAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestServiceAnnotationsApplication.class, args);
		
		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
		
	}

}
