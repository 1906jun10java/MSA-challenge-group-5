package com.example.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// other choices besides JpaRepository as parent type - also have CrudRepository (supertype)
	// and PagingAndSortingRepository

	// method name pattern matching
//public  List<Employee> getAllEmployee ();
//
	}
