package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;

import service.EmployeeService;


	@RestController
	@RequestMapping(value="/employee")
	public class EmployeeController {
		
		private EmployeeService employeeService;
		
		@Autowired // setter injection
		public void setEmployeeService(EmployeeService employeeService) {
			this.employeeService = employeeService;
		}
		
		@RequestMapping(value="/all", method=RequestMethod.GET)
		public ResponseEntity<List<Employee>> getAllEmployee() {
			return new ResponseEntity<>(employeeService.allEmployee(), HttpStatus.OK);
		}
	
		
	
	
	
}
