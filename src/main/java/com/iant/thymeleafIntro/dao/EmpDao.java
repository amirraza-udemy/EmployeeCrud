package com.iant.thymeleafIntro.dao;

import com.iant.thymeleafIntro.entity.Employee;

import java.util.List;

public interface EmpDao {
    public List<Employee> getAllEmp();
    public Employee getEmpById(int id);
    public void saveEmp(Employee E);
}
