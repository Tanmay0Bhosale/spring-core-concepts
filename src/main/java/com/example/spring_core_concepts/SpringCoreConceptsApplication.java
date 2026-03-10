package com.example.spring_core_concepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	private static final Logger logger =
			LoggerFactory.getLogger(SpringCoreConceptsApplication.class);

	public static void main(String[] args) {

		logger.info("Spring Boot Application Started");
		logger.debug("Debug log example");
		logger.warn("Warning log example");

	}
}