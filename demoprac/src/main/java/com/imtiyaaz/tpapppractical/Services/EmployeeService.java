package com.imtiyaaz.tpapppractical.Services;

import com.imtiyaaz.tpapppractical.Domain.Employee;

/**
 * Created by User on 14 Aug 2017.
 */
public interface EmployeeService {
    Employee create(Employee employee);
    Employee read(String employeeName);
    Employee update(Employee employee);
    void delete(String employeeName);
}
