package org.spring.clients;



import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

public class RestClientsDemo {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();

		String response = rt.getForObject("http://localhost:8080/emp", String.class);

		System.out.println(response);

		EmpList response2 = rt.getForObject("http://localhost:8080/emp", EmpList.class);

		System.out.println(response2.getEmpList());
		
		
		RestClient restClient=RestClient.create();
		
		EmpList empList=restClient.get()
				.uri("http://localhost:8080/emp")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.body(EmpList.class);
		
		System.out.println(empList.getEmpList());
		
		//POST Method
		Emp emp = new Emp(124, "Kiran", "Hyderabad", 120000);
		
		Emp e=restClient
		.post()
		.uri("http://localhost:8080/emp")
		.body(emp)
		.accept(MediaType.APPLICATION_JSON)
		.contentType(MediaType.APPLICATION_JSON)
		.retrieve().body(Emp.class);
		
		System.out.println(e);

	}

}
