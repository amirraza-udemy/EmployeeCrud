package com.iant.thymeleafIntro.service;

import com.iant.thymeleafIntro.dao.EmpDao;
import com.iant.thymeleafIntro.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService{
    private EmpDao empDao;

    public EmpServiceImpl(EmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public List<Employee> getAllEmp() {

        List<Employee>list= empDao.getAllEmp();
        return list;
    }

    @Override
    public Employee getEmpById(int id) {
       return empDao.getEmpById(id);
    }
@Transactional
    @Override
    public void saveEmp(Employee E) {
        empDao.saveEmp(E);
    }
}
