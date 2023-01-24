package com.ssdam.toy.login.dy.repository;

import com.ssdam.toy.login.dy.db.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepository extends JpaRepository<Department, Integer> {
    Department save(Department department);
    Department findDepartmentById(int id);
}
