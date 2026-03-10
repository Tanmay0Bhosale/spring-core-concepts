package com.example.spring_core_concepts;

import com.example.spring_core_concepts.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	private static final Logger logger =
			LoggerFactory.getLogger(SpringCoreConceptsApplication.class);

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(SpringCoreConceptsApplication.class, args);

		logger.info("Spring Boot Application Started");
		logger.warn("Warning log example");

		EmployeeBean employee = context.getBean(EmployeeBean.class);

		employee.showEmployeeDetails();
	}
}