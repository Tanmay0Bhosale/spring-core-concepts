package com.example.spring_core_concepts.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int id = 1;
    private String name = "Tanmay";

    @Autowired
    private com.example.spring_core_concepts.component.DepartmentBean departmentBean;

    public void showEmployeeDetails(){

        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + departmentBean.getDeptName());

    }

}