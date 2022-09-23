package com.springboot.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.crud.entity.Employees;

import com.springboot.crud.repo.EmployeeRepository;


@RestController
@RequestMapping("/employee")
public class ManageController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@GetMapping("/")
	public List<Employees> getEmployee() {
		return (List<Employees>) employeeRepository.findAll();
	}
	
	@PostMapping("/")
	public Employees newEmployees(@RequestBody Employees employees) {
		System.out.println(employees);
		return employeeRepository.save(employees);
	}
	
	@PutMapping("/{id}")
	public Employees updateEmployees(@RequestBody Employees employees, @PathVariable int id) {
		try {
			Optional<Employees> optional = employeeRepository.findById(id);
			
			Employees emply = optional.get();
			
			emply.setName(employees.getName());
			emply.setTitle(employees.getTitle());
			emply.setPhoneNo(employees.getPhoneNo());
			emply.setEmail(employees.getEmail());
			emply.setAddress(employees.getAddress());
			emply.setCity(employees.getCity());
			emply.setState(employees.getState());
			emply.setPrimaryName(employees.getPrimaryName());
			emply.setPrimaryPhoneNo(employees.getPrimaryPhoneNo());
			emply.setPrimaryRelation(employees.getPrimaryRelation());
			emply.setSecondaryName(employees.getSecondaryName());
			emply.setSecondaryPhoneNo(employees.getSecondaryPhoneNo());
			emply.setSecondaryRelation(employees.getSecondaryRelation());
			
			System.out.println(emply);
			
			return employeeRepository.save(emply);
		}
		catch(Exception e) {
			System.out.println(e);
			return employeeRepository.save(employees);
		}
	}
	
	@DeleteMapping("/{id}")
	public Employees deleteEmployee(@PathVariable int id) {
		
		Optional<Employees> optional = employeeRepository.findById(id);
		
		Employees findEmployee = optional.get();
		
		employeeRepository.deleteById(id);
		
		return findEmployee;
	}
}
