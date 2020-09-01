package com.maa.reactiverestserviceannotations.hello;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class GreetingService {

	public Mono<String> hello() {

		return Mono.just("Hello, There!");
	}

}
