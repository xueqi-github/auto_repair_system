package com.zlp.auto_repair_system.service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 15:15
 * Description:张立朋，写点注释吧!!
 */

public interface EmployeeService {

    Integer addEmployee(Employee employee);
    Integer addEmployeeList(List<Employee> employeeList);
    Employee findEmployeeById(Integer id);
    List<Employee> findEmployeeByName(String name);
    String getAllEmployee(Integer pageSize,Integer pageNumber);
    Integer updateEmployee(Employee employee);
    Integer updateEmployeeList(List<Employee> employee);
    Integer deleteEmployeeById(Integer id);
    Integer deleteEmployeeList(List<Integer> ids);
}
