package com.demo.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.entity.Emp;
import com.demo.spring.repositories.EmpRepository;

@Service
public class EmpService {

	@Autowired 
	EmpRepository empRepository;
	
	
	public List<Emp> getAllEmp(){
		return empRepository.findAll();
	}
	
	public Emp findEmpById(Integer id) {
		return empRepository.findById(id).orElseThrow(()->new RuntimeException("Emp Not Found"));
	}
}
