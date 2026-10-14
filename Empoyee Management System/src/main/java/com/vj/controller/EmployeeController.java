package com.vj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.vj.model.Employee;
import com.vj.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{

	private final EmployeeService service;

	public EmployeeController(EmployeeService service) 
	{
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Employee> create(@Validated @RequestBody Employee employee) 
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(employee));
	}

	@GetMapping
	public List<Employee> getAll(@RequestParam(required = false) String department,
			@RequestParam(required = false) String name) 
	{
		if (department != null)
			return service.getByDepartment(department);
		if (name != null)
			return service.searchByName(name);
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Employee getById(@PathVariable Long id)
	{
		return service.getById(id);
	}

	@PutMapping("/{id}")
	public Employee update(@PathVariable Long id, @Validated @RequestBody Employee employee) 
	{
		return service.update(id, employee);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) 
	{
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
