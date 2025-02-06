package com.demo.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.EmpList;
import com.demo.spring.services.EmpService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService empService;
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	//GET http://localhost:8080/greet
	@GetMapping(path="/greet", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> greetUser() {
		logger.info("inside the controller {} ",this.getClass().getSimpleName());
		return ResponseEntity.ok("Welcome to Spring REST Service");
	}
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<EmpList> getAll(){
		return ResponseEntity.ok(empService.getAllEmp());
	}
	
	@GetMapping(path="/{empid}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Emp> findOneEmp(@PathVariable("empid") Integer id){
		return ResponseEntity.ok(empService.findEmpById(id));
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Emp> createEmp(@RequestBody @Valid Emp e){
		Emp emp =e;
		return ResponseEntity.ok(empService.saveToDb(e));
	}
	@PatchMapping(path="/{id}/{amount}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity updateEmpSalary(@PathVariable Integer id, @PathVariable double amount){
		empService.updateSalary(id, amount);
		return ResponseEntity.ok("Salary Updated");
	}
}
