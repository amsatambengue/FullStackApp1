package com.amsatech.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amsatech.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
