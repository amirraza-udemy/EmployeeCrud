package com.iant.thymeleafIntro.service;

import com.iant.thymeleafIntro.entity.Employee;

import java.util.List;

public interface EmpService {
    public List<Employee> getAllEmp();
    public Employee getEmpById(int id);
    public void saveEmp(Employee E);
}
