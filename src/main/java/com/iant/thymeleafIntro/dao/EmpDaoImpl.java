package com.iant.thymeleafIntro.dao;

import com.iant.thymeleafIntro.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmpDaoImpl implements EmpDao{
    private EntityManager entityManager;

    public EmpDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmp() {
        TypedQuery typedQuery=entityManager.createQuery("from Employee",Employee.class);
        List<Employee> list=typedQuery.getResultList();

        return list;
    }

    @Override
    public Employee getEmpById(int id) {
       Employee E=  entityManager.find(Employee.class,id);
        return E;
    }

    @Override
    public void saveEmp(Employee E) {
        entityManager.persist(E);
    }
}
