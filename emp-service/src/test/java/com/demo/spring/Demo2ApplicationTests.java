package com.demo.spring;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.spring.entity.Emp;
import com.demo.spring.services.EmpService;

@SpringBootTest
@AutoConfigureMockMvc
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class})
class Demo2ApplicationTests {

	@Autowired
	MockMvc mvc;
	
	@MockitoBean
	EmpService empService;
	
	@Test
	public void testOneEmployeeSuccess()  throws Exception{
		
		mvc.perform(get("/emp/greet"))
		.andExpect(status().isOk());
		//.andExpect(content().string("Welcome"));
	}
	
	@Test
	public void testFindByIdSuccess() throws Exception{
		when(empService.findEmpById(104)).thenReturn(new Emp(104, "kakaji", "Pune", 123));
		
		mvc.perform(get("/emp/104"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.name").value("kakaji"));
	}

}
