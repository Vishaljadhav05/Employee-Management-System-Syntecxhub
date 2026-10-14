package com.vj.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vj.exception.DuplicateEmailException;
import com.vj.exception.ResourceNotFoundException;
import com.vj.model.Employee;
import com.vj.repository.EmployeeRepository;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

	private final EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public Employee create(Employee employee) 
	{
		if (repository.existsByEmail(employee.getEmail())) 
		{
			throw new DuplicateEmailException("Email already exists: " + employee.getEmail());
		}
		employee.setId(null);
		return repository.save(employee);
	}

	@Transactional(readOnly = true)
	public List<Employee> getAll() 
	{
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Employee getById(Long id) 
	{
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
	}

	@Transactional(readOnly = true)
	public List<Employee> getByDepartment(String department) 
	{
		return repository.findByDepartmentIgnoreCase(department);
	}

	@Transactional(readOnly = true)
	public List<Employee> searchByName(String keyword) 
	{
		return repository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(keyword, keyword);
	}

	public Employee update(Long id, Employee updated) 
	{
		Employee existing = getById(id);

		if (!existing.getEmail().equalsIgnoreCase(updated.getEmail()) && repository.existsByEmail(updated.getEmail())) {
			throw new DuplicateEmailException("Email already exists: " + updated.getEmail());
		}

		existing.setFirstName(updated.getFirstName());
		existing.setLastName(updated.getLastName());
		existing.setEmail(updated.getEmail());
		existing.setPhone(updated.getPhone());
		existing.setDepartment(updated.getDepartment());
		existing.setDesignation(updated.getDesignation());
		existing.setSalary(updated.getSalary());
		existing.setDateOfJoining(updated.getDateOfJoining());
		return repository.save(existing);
	}

	public void delete(Long id) 
	{
		repository.delete(getById(id));
	}
}
