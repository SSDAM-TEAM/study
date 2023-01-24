package com.ssdam.toy.login.dy.service;

import com.ssdam.toy.login.dy.db.entities.Department;
import org.springframework.stereotype.Service;

@Service
public interface CommonService {
    Void makeDepartment();
    Department findDepartment(int id);
}
