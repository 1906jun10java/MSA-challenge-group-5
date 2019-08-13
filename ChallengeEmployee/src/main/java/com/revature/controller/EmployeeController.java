package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.EmployeeService;
import com.revature.bean.Employee;


@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	private EmployeeService employeeService;
	
	 @Autowired
	    public void setEmployeeService(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<Employee>> findAll() {
	        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
	    }
}
