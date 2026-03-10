# Spring Core Concepts Project

## Overview

This project demonstrates fundamental **Spring Framework concepts** such as:

* Spring Boot application setup
* Logging using SLF4J
* Inversion of Control (IoC)
* Dependency Injection using `@Autowired`

The goal is to understand how Spring manages objects and dependencies through its IoC container.

---

# Technologies Used

* Java 17
* Spring Boot
* Maven
* SLF4J Logger
* Spring IoC Container

---

# Project Structure

```
spring-core-concepts
│
├── pom.xml
│
└── src/main
    ├── java/com/demo/springconcepts
    │       SpringConceptsApplication.java
    │
    └── component
            EmployeeBean.java
            DepartmentBean.java
```

---

# Use Cases

### UC1 – Create Spring Concepts Project

A basic Spring Boot project created using Spring Initializr.

### UC2 – Add Logger

SLF4J logger is used to log application messages.

### UC3 – Dependency Injection

Two components (`EmployeeBean` and `DepartmentBean`) demonstrate dependency injection using `@Autowired`.

---

# Running the Application

```
mvn spring-boot:run
```

---

# Learning Outcomes

After completing this project you will understand:

* Spring Boot project setup
* Logger implementation
* Spring IoC container
* Dependency injection using annotations

---

# Author

Tanmay Bhosale
