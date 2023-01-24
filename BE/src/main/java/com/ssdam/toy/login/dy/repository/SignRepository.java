package com.ssdam.toy.login.dy.repository;

import com.ssdam.toy.login.dy.db.entities.Employee;
import com.ssdam.toy.login.dy.db.response.EmployeeRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignRepository extends JpaRepository<Employee, String> {
    Employee save(Employee employee);
}
