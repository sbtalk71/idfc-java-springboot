package org.spring.clients;

public class Emp {
	
	private Integer empId;
	
	
	private String name;
	
	
	private String city;
	
	
	private double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer empId, String name, String city, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+name+" "+salary+" "+city;
	}

}
