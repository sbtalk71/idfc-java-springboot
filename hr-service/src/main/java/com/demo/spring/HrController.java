package com.demo.spring;

import org.spring.clients.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HrController {

	@Autowired
	HrService hrService;
	
	@GetMapping(path="/get/{id}")
	public ResponseEntity<Emp> getEmpInfo(@PathVariable Integer id){
		return ResponseEntity.ok(hrService.getEmpDetails(id));
	}
	
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleException(RuntimeException ex){
		return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Service Unavailable");
	}
}
