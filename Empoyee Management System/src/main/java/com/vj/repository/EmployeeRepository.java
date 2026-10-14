package com.vj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.Employee;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	List<Employee> findByDepartmentIgnoreCase(String department);

	List<Employee> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String first, String last);

	boolean existsByEmail(String email);
}
