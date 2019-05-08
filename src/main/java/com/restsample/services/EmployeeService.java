package com.restsample.services;

import org.springframework.stereotype.Service;

import com.restsample.dtos.EmployeeDto;
import com.restsample.utils.EmployeeUtils;

@Service
public class EmployeeService {
	
	public void saveEmployee(EmployeeDto employeeDto) {
		
		EmployeeUtils.employeeList.put(employeeDto.getId(), employeeDto);
		
	}

}
