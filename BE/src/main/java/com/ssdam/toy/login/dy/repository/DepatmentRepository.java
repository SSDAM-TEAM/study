package com.ssdam.toy.login.dy.repository;

import com.ssdam.toy.login.dy.db.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepatmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentById(long id);
}
