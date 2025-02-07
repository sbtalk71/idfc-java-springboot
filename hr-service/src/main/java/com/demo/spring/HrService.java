package com.demo.spring;

import org.spring.clients.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class HrService {

	@Autowired
	RestClient.Builder restBuilder;
	
	@CircuitBreaker(name="backendB",fallbackMethod = "getDetailsFallback")
	public Emp getEmpDetails(Integer id) {
		return restBuilder.build()
				.get().uri("http://localhost:8080/emp/"+id)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.body(Emp.class);
	}
	
	public Emp getDetailsFallback(Exception ex) {
		throw new RuntimeException("Service unavailable");
	}
	
	
}
