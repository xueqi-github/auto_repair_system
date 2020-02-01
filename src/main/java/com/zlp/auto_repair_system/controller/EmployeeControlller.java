package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 17:22
 * Description:张立朋，写点注释吧!!
 */
@RestController
public class EmployeeControlller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("get/allEmployee")
    public String getAllEmployee(Integer pageSize, Integer pageNumber){
        return employeeService.getAllEmployee(pageSize,pageNumber);
    }

    @GetMapping("find/employee/byId")
    public Employee findEmployeeById(Integer id){
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("find/employee/byName")
    public List<Employee> findEmployeeByName(String name){
        return employeeService.findEmployeeByName(name);
    }

    @PostMapping("add/employee")
    public Integer addEmployee(Employee employee){
        employee.setBirthday(new Date());
        return employeeService.addEmployee(employee);
    }

    //批量添加,JSON格式
    @PostMapping("add/employeeList")
    public Integer addEmployeeList(@RequestBody List<Employee> employees){
        return employeeService.addEmployeeList(employees);
    }

    @PostMapping("update/employee")
    public Integer updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @PostMapping("update/employeeList")
    public Integer updateEmployeeList(List<Employee> employee){
        return employeeService.updateEmployeeList(employee);
    }

    @PostMapping("delete/employee/byId")
    public Integer deleteEmployeeById(Integer id){
        return employeeService.deleteEmployeeById(id);
    }

    @PostMapping("delete/employeeList")
    public Integer deleteEmployeeList(List<Integer> ids){
        return employeeService.deleteEmployeeList(ids);
    }

}
