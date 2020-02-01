package com.zlp.auto_repair_system.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.zlp.auto_repair_system.dao.EmployeeDao;
import com.zlp.auto_repair_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 16:37
 * Description:张立朋，写点注释吧!!
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Integer addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    @Override
    public Integer addEmployeeList(List<Employee> employeeList) {
        return employeeDao.addEmployeeList(employeeList);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeDao.findEmployeeById(id);
    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return employeeDao.findEmployeeByName(name);
    }


    @Override
    public String getAllEmployee(Integer pageSize, Integer pageNumber) {
        PageHelper.offsetPage(pageSize,pageNumber);
        List<Employee> allEmployee = employeeDao.getAllEmployeeInfo();
        return JSON.toJSONString(allEmployee);
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public Integer updateEmployeeList(List<Employee> employees) {
        return employeeDao.updateEmployeeList(employees);
    }

    @Override
    public Integer deleteEmployeeById(Integer id) {
        return employeeDao.deleteEmployee(id);
    }

    @Override
    public Integer deleteEmployeeList(List<Integer> ids) {
        return employeeDao.deleteEmployeeList(ids);
    }
}
