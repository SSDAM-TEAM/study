package com.ssdam.toy.login.dy.service;

import com.ssdam.toy.login.dy.db.entities.Department;
import com.ssdam.toy.login.dy.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService{

    private static final String deps[] = {"인사팀", "총무팀", "개발팀"};

    @Autowired
    private CommonRepository commonRepository;

    @Override
    public Void makeDepartment() {
        for (String dep:deps) {
            Department department = Department.builder()
                            .name(dep)
                            .build();
            commonRepository.save(department);
        }
        return null;
    }

    @Override
    public Department findDepartment(int id) {
        return commonRepository.findDepartmentById(id);
    }
}
