package com.springboot.crud.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.crud.entity.Employees;

public interface EmployeeRepository extends CrudRepository<Employees, Integer>{

}



