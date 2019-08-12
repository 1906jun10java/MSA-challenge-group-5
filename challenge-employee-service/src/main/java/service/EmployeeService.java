package service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.EmployeeRepository;
import com.example.beans.Employee;

	@Service
	public class EmployeeService {

		private EmployeeRepository employeeRepository;

		@Autowired
		public EmployeeService(EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
		}
		
		public List<Employee> allEmployee() {
			return this.employeeRepository.findAll();
		}
		

	}
	
	
	
	
	
	
	

