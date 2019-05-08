package com.restsample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restsample.dtos.EmployeeDto;
import com.restsample.services.EmployeeService;
import com.restsample.utils.EmployeeUtils;

@RestController(value = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello From Employee";
	}

	@RequestMapping(value = "/getemployee", method = RequestMethod.GET)
	public EmployeeDto getEmployee() {
		EmployeeDto emp = new EmployeeDto();
		emp.setId(1);
		emp.setEmail("suvashkhatiwada@gmail.com");
		emp.setName("Suvash Khatiwada");
		emp.setSalary(10000);
		emp.setAddress("Fairfax");
		return emp;
	}

	@RequestMapping(value = "/getemployee/{id}", method = RequestMethod.GET)
	public EmployeeDto getEmployeeById(@PathVariable Integer id) {
		return EmployeeUtils.employeeList.get(id);
	}

	@RequestMapping(value = "/getemployee/", method = RequestMethod.GET)
	public EmployeeDto getEmployeeByIdParam(@RequestParam Integer id) {
		return EmployeeUtils.employeeList.get(id);
	}
	
	@RequestMapping(value = "/setemployee", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.saveEmployee(employeeDto);
	}


}
