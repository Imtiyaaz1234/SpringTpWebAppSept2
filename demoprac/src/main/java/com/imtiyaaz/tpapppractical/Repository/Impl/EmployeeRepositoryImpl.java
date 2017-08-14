package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Domain.Employee;
import com.imtiyaaz.tpapppractical.Repository.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 14 Aug 2017.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employeeTable;

    private EmployeeRepositoryImpl(){
        employeeTable = new HashMap<String, Employee>();
    }

    public static EmployeeRepositoryImpl getInstance(){
        if(repository == null)
            repository = new EmployeeRepositoryImpl();
        return repository;
    }

    public Employee create(Employee employee){
        employeeTable.put(employee.getEmployeeName(), employee);
        Employee savedEmployee = employeeTable.get(employee.getEmployeeName());
        return savedEmployee;
    }

    public Employee read(String employeeName){
        Employee employee = employeeTable.get(employeeName);
        return employee;
    }

    public Employee update(Employee employee){
        employeeTable.put(employee.getEmployeeName(), employee);
        Employee savedEmployee = employeeTable.get(employee.getEmployeeName());
        return savedEmployee;
    }

    public void delete(String employeeName){
        employeeTable.remove(employeeName);
    }
}
