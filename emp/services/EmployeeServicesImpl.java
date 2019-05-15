package com.employee.services;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

public class EmployeeServicesImpl implements EmployeeServices{

	@Override
	public boolean addEmp(Employee e) {
		EmployeeDaoImpl ed=new EmployeeDaoImpl();
		ed.insert(e);
		return true;
	}
	

}
