package com.restsample.utils;

import java.util.HashMap;
import java.util.Map;

import com.restsample.dtos.EmployeeDto;

public class EmployeeUtils {

	public static Map<Integer, EmployeeDto> employeeList = new HashMap<Integer, EmployeeDto>();

	static {
		EmployeeDto emp = new EmployeeDto();
		emp.setId(1);
		emp.setEmail("suvashkhatiwada@gmail.com");
		emp.setName("Suvash Khatiwada");
		emp.setSalary(10000);
		emp.setAddress("Fairfax");

		EmployeeDto emp1 = new EmployeeDto();
		emp1.setId(2);
		emp1.setEmail("abinash.bastola@gmail.com");
		emp1.setName("Abinash Bastola");
		emp1.setSalary(10000);
		emp1.setAddress("Vienna");

		employeeList.put(1, emp);
		employeeList.put(2, emp1);
	}

}
