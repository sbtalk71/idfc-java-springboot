package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Emp> empList=Arrays.asList(new Emp(100, "Ranga", "Hyderabad", 60000),
				new Emp(101, "Shiva", "Hyderabad", 70000),
				new Emp(102, "Rajan", "Bangalore", 80000),
				new Emp(103, "Shruti", "Chennai", 50000),
				new Emp(104, "Amit", "Chennai", 40000));
		
		empList.stream().filter(e->e.getCity().equals("Hyderabad"))
		.map(e->{e.setCity("Bangalore");
				e.setSalary(e.getSalary()+500);
				return e;
				}).forEach(System.out::println);

	}

}
