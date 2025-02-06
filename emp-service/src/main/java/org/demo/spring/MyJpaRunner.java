package org.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Component
public class MyJpaRunner implements CommandLineRunner{

	@PersistenceContext
	EntityManager entityManager;
	
	Logger logger=LoggerFactory.getLogger("myclass");
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		Emp e1= new Emp(114, "Pinki", "Bangalore",67000 );
		//entityManager.persist(e1);
		
		Emp e2= entityManager.find(Emp.class, 112);
		
		logger.info("{}",e2);
		
		
		Query query=entityManager.createQuery("select e from Emp e");
		
		query.getResultList().stream().forEach(System.out::println);
		
		
	}

}
