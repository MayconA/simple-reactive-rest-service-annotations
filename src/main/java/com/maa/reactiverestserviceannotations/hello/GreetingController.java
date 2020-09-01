package com.maa.reactiverestserviceannotations.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class GreetingController {

	@Autowired
	private GreetingService service;

	@GetMapping
	public Mono<String> hello() {

		return service.hello();
	}
	
	@GetMapping("/2")
	public Mono<ResponseEntity<String>> hello2() {
		
		return service.hello()
         .map(texto -> ResponseEntity.ok(texto))
         .defaultIfEmpty(ResponseEntity.notFound().build());

	
	}

}
