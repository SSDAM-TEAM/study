package com.ssdam.toy.login.mj.repository;

import com.ssdam.toy.login.mj.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Employee findByEmployeeId(String employeeId);

}
